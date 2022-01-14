package com.fiserv.merchantmaintenance.service;

import com.fiserv.merchantmaintenance.entity.Weather;
import com.fiserv.merchantmaintenance.model.ResponseType;

import java.text.ParseException;
import java.util.List;

public interface WeatherService {


    ResponseType getWeatherService(String dates, int sensorId, String city, String country, String metrics) throws ParseException;

    void insertWeatherService(List<Weather> weathers) throws ParseException;

    void updateWeatherService(List<Weather> weathers);
}
