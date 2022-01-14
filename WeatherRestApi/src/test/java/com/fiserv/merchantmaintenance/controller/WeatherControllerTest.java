package com.fiserv.merchantmaintenance.controller;

import com.fiserv.merchantmaintenance.dao.WeatherDao;
import com.fiserv.merchantmaintenance.entity.Weather;
import com.fiserv.merchantmaintenance.exception.GenericException;
import com.fiserv.merchantmaintenance.model.*;
import com.fiserv.merchantmaintenance.service.CommonService;
import com.fiserv.merchantmaintenance.service.MerchantAccountFeesService;
import com.fiserv.merchantmaintenance.service.WeatherServiceImpl;
import com.fiserv.merchantmaintenance.sql.SqlHandler;
import lombok.SneakyThrows;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.repository.init.Jackson2ResourceReader;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class WeatherControllerTest {

    @Autowired
    private WeatherDao wd;

    @Autowired
    private WeatherServiceImpl wsi;

    @Autowired
    private WeatherController wc;


    private List<Weather> weatherCreate = null;

    @Before
    public void setUp() {
        weatherCreate = readMWeatherFromFile();
    }

    @SneakyThrows
    private List<Weather> readMWeatherFromFile() {
        return (List<Weather>) new Jackson2ResourceReader().readFrom(new ClassPathResource("weatherCreate.json"),
                getClass().getClassLoader());
    }

    @Test
    public void mercahntAccountUpdate() throws SQLException, GenericException, ParseException {

        this.wc.insertWeatherReadings(weatherCreate);

        String dates = "4";

        String todaysDate = this.wd.getDate();


        Weather weather = new Weather();
        weather = (Weather) this.wd.getWeather(3, "Wicklow", "Ireland", todaysDate, wsi.getOldDates(Integer.parseInt(dates), todaysDate));

        assertThat(weather.getTemperature()).isEqualTo(9);
        assertThat(weather.getHumidity()).isEqualTo(70);
        assertThat(weather.getWindSpeed()).isEqualTo(25);
        assertThat(weather.getCity()).isEqualTo("Wicklow");
        assertThat(weather.getCountry()).isEqualTo("Ireland");
        assertThat(weather.getSensorId()).isEqualTo(3);

    }
}
