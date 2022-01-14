package com.fiserv.merchantmaintenance.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WeatherPK implements Serializable{

    private static final long serialVersionUID = 6875973361769941183L;

    private String sensorId;
    private String city;
    private String country;
}
