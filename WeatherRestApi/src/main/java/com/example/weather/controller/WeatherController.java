package com.fiserv.merchantmaintenance.controller;

import com.fiserv.merchantmaintenance.entity.Weather;
import com.fiserv.merchantmaintenance.model.ErrorType;
import com.fiserv.merchantmaintenance.model.ResponseType;
import com.fiserv.merchantmaintenance.service.WeatherService;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.text.ParseException;
import java.util.List;
import java.util.UUID;

import static com.fiserv.merchantmaintenance.common.Constants.HEADER_FSV_INTERACTION_ID;


@RestController
@Validated
@Slf4j
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @ApiOperation(value = "Retrieve weather", nickname = "getWeather", notes = "Retrieves the average of the metrics passed over the period passed", response = ResponseType.class, authorizations = {
            @Authorization(value = "Authorization")
    }, tags={ "Weather", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = ResponseType.class),
            @ApiResponse(code = 400, message = "Invalid request", response = ResponseType.class),
            @ApiResponse(code = 401, message = "Authorization error", response = ResponseType.class),
            @ApiResponse(code = 406, message = "Invalid Parameter.", response = ResponseType.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = ResponseType.class) })
    @RequestMapping(value = "/weather",
            produces = { "application/json" },
            method = RequestMethod.GET)
    public ResponseEntity<ResponseType> getWeatherReadings(@ApiParam(value = "Standard HTTP Header; Represents the format of the payload being provided in the request. This must be set to application/json and applicable for POST/PATCH." ,required=true, allowableValues="application/json, application/json;charset=UTF-8")
                                                       @RequestHeader(value="dates", required=false) String days, @ApiParam(value = "Number of days for which the weather data is to be returned", defaultValue = "1", required = true)
                                                       @RequestHeader(value="sensor", required=true) int sensor, @ApiParam(value = "Institution number for which you wish to board the merchant. This information defines the acquirer for the merchant." ,required=true)
                                                        @RequestHeader(value="country", required=true) String country, @ApiParam(value = "Institution number for which you wish to board the merchant. This information defines the acquirer for the merchant." ,required=true)
                                                        @RequestHeader(value="city", required=true) String city, @ApiParam(value = "Institution number for which you wish to board the merchant. This information defines the acquirer for the merchant." ,required=true)
                                                        @RequestParam(value = "values", required = false, defaultValue="ALL") String metrics) throws ParseException {
        ResponseType responseType = this.weatherService.getWeatherService(days, sensor, city, country,  metrics);


        return ResponseEntity.status(HttpStatus.OK).headers(gethttpHeader(null)).body(responseType);
    }

    @ApiOperation(value = "Add Weather Values", nickname = "insertWeatherReadings", notes = "Adds one or more weather readings ", response = ResponseType.class, authorizations = {
            @Authorization(value = "Authorization")
    }, tags={ "Weather", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = ResponseType.class),
            @ApiResponse(code = 400, message = "Invalid request", response = ResponseType.class),
            @ApiResponse(code = 401, message = "Authorization error", response = ResponseType.class),
            @ApiResponse(code = 406, message = "Invalid Parameter.", response = ResponseType.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = ResponseType.class) })
    @RequestMapping(value = "/weather",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    public ResponseEntity<ResponseType> insertWeatherReadings(@ApiParam(value = "Standard HTTP Header; Represents the format of the payload being provided in the request. This must be set to application/json and applicable for POST/PATCH." ,required=true, allowableValues="application/json, application/json;charset=UTF-8")
                                                           @Valid @RequestBody List<Weather> weathers) throws ParseException {

        ErrorType et = new ErrorType();

        {
            this.weatherService.insertWeatherService(weathers);
        }

        et.setId(String.valueOf(UUID.randomUUID()));
        et.setCode("WEATHER_METRICS_INSERTED");
        et.setTitle("Weather Reading successfully inserted");

        ResponseType responseType = new ResponseType();
        responseType.setData(et);

        return ResponseEntity.status(HttpStatus.OK).headers(gethttpHeader(null)).body(responseType);
    }

    @ApiOperation(value = "Update Weather Values", nickname = "updateWeatherReadings", notes = "Updates one or more weather readings ", response = ResponseType.class, authorizations = {
            @Authorization(value = "Authorization")
    }, tags={ "Weather", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = ResponseType.class),
            @ApiResponse(code = 400, message = "Invalid request", response = ResponseType.class),
            @ApiResponse(code = 401, message = "Authorization error", response = ResponseType.class),
            @ApiResponse(code = 406, message = "Invalid Parameter.", response = ResponseType.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = ResponseType.class) })
    @RequestMapping(value = "/weather",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.PUT)
    public ResponseEntity<ResponseType> updateWeatherReadings(@ApiParam(value = "Standard HTTP Header; Represents the format of the payload being provided in the request. This must be set to application/json and applicable for POST/PATCH." ,required=true, allowableValues="application/json, application/json;charset=UTF-8")
                                                            @RequestBody List<Weather> weathers) {
        ErrorType et = new ErrorType();

        {
            this.weatherService.updateWeatherService(weathers);
        }

        et.setId(String.valueOf(UUID.randomUUID()));
        et.setCode("WEATHER_METRICS_UPDATED");
        et.setTitle("Weather Reading successfully updated");

        ResponseType responseType = new ResponseType();
        responseType.setData(et);

        return ResponseEntity.status(HttpStatus.OK).headers(gethttpHeader(null)).body(responseType);
    }

    private HttpHeaders gethttpHeader(String fsVInteractionId) {
        HttpHeaders headers = new HttpHeaders();
        headers.set(HEADER_FSV_INTERACTION_ID, fsVInteractionId);
        return headers;
    }
}
