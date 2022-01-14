package com.fiserv.merchantmaintenance.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@Data
@NoArgsConstructor
@IdClass(WeatherPK.class)
public class Weather {
    @Id
    @Column(name = "SENSOR_ID")
    private String sensorId;

    @Id
    @Column(name = "CITY")
    private String city;

    @Id
    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "TEMPERATURE")
    private String temperature;

    @Column(name = "HUMIDITY")
    private String humidity;

    @Column(name = "WIND_SPEED")
    private String windSpeed;

    @Column(name = "DATES")
    private String date;
}
