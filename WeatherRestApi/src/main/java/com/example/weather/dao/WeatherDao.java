package com.fiserv.merchantmaintenance.dao;

import com.fiserv.merchantmaintenance.entity.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface WeatherDao extends JpaRepository<Weather, String> {

    @Query(value = SqlQuery.GET_DATE, nativeQuery = true)
    String getDate();

    @Query(value = SqlQuery.GET_WEATHER, nativeQuery = true)
    List<Weather> getWeather(int sensorId, String city, String country, String date, String daysAgo);

    @Modifying
    @Transactional
    @Query(value = SqlQuery.UPDATE_WEATHER, nativeQuery = true)
    void updateWeather(String sensorId, String city, String country, String temperature, String humidity, String windSpeed, String date);

    @Modifying
    @Transactional
    @Query(value = SqlQuery.INSERT_WEATHER, nativeQuery = true)
    void insertWeather(String sensorId, String city, String country, String temperature, String humidity, String windSpeed, String date);

    @Modifying
    @Transactional
    @Query(value = SqlQuery.CREATE_WEATHER, nativeQuery = true)
    void createWeather();

    @Modifying
    @Transactional
    @Query(value = SqlQuery.INSERT_VALUES, nativeQuery = true)
    void addValue();

    @Query(value = SqlQuery.GET_WEATHER_UNIQUE, nativeQuery = true)
    List<Weather> checkIfUniqueReading(String sensorId, String city, String country, String date);

    @Query(value = SqlQuery.GET_ALL_WEATHER, nativeQuery = true)
    List<Weather> getall();

    @Modifying
    @Transactional
    @Query(value = SqlQuery.DROP_WEATHER, nativeQuery = true)
    void dropTable();

    @Query(value = SqlQuery.GET_WEATHER_NO_HUM, nativeQuery = true)
    List<Weather> getWeatherNoHum(int sensorId, String city, String country, String date, String daysAgo);

    @Query(value = SqlQuery.GET_WEATHER_NO_WS, nativeQuery = true)
    List<Weather> getWeatherNoWS(int sensorId, String city, String country, String date, String daysAgo);

    @Query(value = SqlQuery.GET_WEATHER_NO_TEM, nativeQuery = true)
    List<Weather> getWeatherNoTem(int sensorId, String city, String country, String date, String daysAgo);

    @Query(value = SqlQuery.GET_WEATHER_TEM, nativeQuery = true)
    List<Weather> getWeatherTem(int sensorId, String city, String country, String date, String daysAgo);

    @Query(value = SqlQuery.GET_WEATHER_WS, nativeQuery = true)
    List<Weather> getWeatherWS(int sensorId, String city, String country, String date, String daysAgo);

    @Query(value = SqlQuery.GET_WEATHER_HUM, nativeQuery = true)
    List<Weather> getWeatherHum(int sensorId, String city, String country, String date, String daysAgo);
}
