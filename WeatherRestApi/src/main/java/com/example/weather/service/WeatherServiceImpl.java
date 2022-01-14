package com.fiserv.merchantmaintenance.service;

import com.fiserv.merchantmaintenance.dao.WeatherDao;
import com.fiserv.merchantmaintenance.entity.Weather;
import com.fiserv.merchantmaintenance.exception.NotAcceptableException;
import com.fiserv.merchantmaintenance.model.ResponseType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    private WeatherDao weatherDao;

    @Override
    public ResponseType getWeatherService(String dates, int sensorId, String city, String country, String metrics) throws ParseException {

//        this.weatherDao.dropTable();
//
//        this.weatherDao.createWeather();

//        this.weatherDao.addValue();


        metrics = metrics.replace(",", "");

        String todaysDate = this.weatherDao.getDate();

        List<Weather> weather = null;
        
        weather = this.weatherDao.getall();

        if(metrics.contains("ALL")){
            weather = this.weatherDao.getWeather(sensorId, city, country, todaysDate, getOldDates(Integer.parseInt(dates), todaysDate));
        }else if(metrics.contains("temperature") && metrics.contains("windspeed")){
            weather = this.weatherDao.getWeatherNoHum(sensorId, city, country, todaysDate, getOldDates(Integer.parseInt(dates), todaysDate));

        }else if(metrics.contains("temperature") && metrics.contains("humidity")){
            weather = this.weatherDao.getWeatherNoWS(sensorId, city, country, todaysDate, getOldDates(Integer.parseInt(dates), todaysDate));

        }else if(metrics.contains("windspeed") && metrics.contains("humidity")){
            weather = this.weatherDao.getWeatherNoTem(sensorId, city, country, todaysDate, getOldDates(Integer.parseInt(dates), todaysDate));

        }else if(metrics.contains("temperature")){
            weather = this.weatherDao.getWeatherTem(sensorId, city, country, todaysDate, getOldDates(Integer.parseInt(dates), todaysDate));

        }else if(metrics.contains("windspeed")){
            weather = this.weatherDao.getWeatherWS(sensorId, city, country, todaysDate, getOldDates(Integer.parseInt(dates), todaysDate));

        }else if(metrics.contains("humidity")){
            weather = this.weatherDao.getWeatherHum(sensorId, city, country, todaysDate, getOldDates(Integer.parseInt(dates), todaysDate));
        }

        int avgTemp = 0;
        int avgWindSpeed = 0;
        int avgHumidity = 0;

        for(int i = 0; i < weather.size(); i++){
            avgTemp += weather.get(i).getTemperature();
            avgHumidity += weather.get(i).getHumidity();
            avgWindSpeed += weather.get(i).getWindSpeed();
        }

        Weather avgWeather = new Weather();

        if(!weather.isEmpty()) {

            avgWeather.setTemperature(avgTemp / weather.size());
            avgWeather.setHumidity(avgHumidity / weather.size());
            avgWeather.setWindSpeed(avgWindSpeed / weather.size());
            avgWeather.setCity(city);
            avgWeather.setSensorId(sensorId);
            avgWeather.setCountry(country);
            avgWeather.setDate(getOldDates(Integer.parseInt(dates), todaysDate));
        }

       ResponseType responseType = new ResponseType();
       responseType.setData(avgWeather);

       return responseType;
    }

    @Override
    public void insertWeatherService(List<Weather> weather) throws ParseException {

        for(Weather weatherValues: weather){

            List<Weather> getWeather = this.weatherDao.checkIfUniqueReading(weatherValues.getSensorId(), weatherValues.getCity(), weatherValues.getCountry(), weatherValues.getDate());

            if(!getWeather.isEmpty()){
                throw new NotAcceptableException("WEATHER READING ALREADY EXISTS FOR THIS SENSOR AND DATE",
                        "Values for this sensor and date are already present in table ", "sensorId[" + weatherValues.getSensorId() + "], date[" + weatherValues.getDate() + "]",
                        UUID.randomUUID());
            }
        }

        for(Weather weatherValues: weather){
            this.weatherDao.insertWeather(weatherValues.getSensorId(), weatherValues.getCity(), weatherValues.getCountry(), weatherValues.getTemperature(), weatherValues.getHumidity(),
                                 weatherValues.getWindSpeed(), weatherValues.getDate());
        }
    }

    @Override
    public void updateWeatherService(List<Weather> weather) {
        for(Weather weatherValues: weather){

            List<Weather> getWeather = this.weatherDao.checkIfUniqueReading(weatherValues.getSensorId(), weatherValues.getCity(), weatherValues.getCountry(), weatherValues.getDate());

            if(getWeather.isEmpty()){
                throw new NotAcceptableException("WEATHER READING DOES NOT ALREADY EXISTS FOR THIS SENSOR AND DATE",
                        "Values for this sensor and date are not present in table ", "sensorId[" + weatherValues.getSensorId() + "], date[" + weatherValues.getDate() + "], use POST to insert the weather data",
                        UUID.randomUUID());            }
        }

        for(Weather weatherValues: weather){
            this.weatherDao.updateWeather(weatherValues.getSensorId(), weatherValues.getCity(), weatherValues.getCountry(), weatherValues.getTemperature(), weatherValues.getHumidity(),
                    weatherValues.getWindSpeed(), weatherValues.getDate());
        }

    }

    public String getOldDates(int dates, String todaysDate) throws ParseException {

        long DAY_IN_MS = 1000 * 60 * 60 * 24;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = sdf.parse(todaysDate);

        String oldDate = String.valueOf(new Date(date.getTime() - (dates * DAY_IN_MS)));

        DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
        DateFormat formatter1 = new SimpleDateFormat("yyyyMMdd");

        String oldDates = formatter1.format(formatter.parse(oldDate));

        return oldDates;
    }
}
