package com.fiserv.merchantmaintenance.dao;

public class SqlQuery {




    private SqlQuery() {

    }

    public static final String GET_ALL_WEATHER = "SELECT * FROM WEATHER";

    public static final String DROP_WEATHER = "drop table WEATHER";

    public static final String GET_WEATHER_NO_HUM = "SELECT AVG(TEMPERATURE) AS TEMPERATURE," +
                                                        " AVG(WIND_SPEED) AS WIND_SPEED, " +
                                                        " SENSOR_ID, " +
                                                        " CITY, " +
                                                        " COUNTRY " +
                                                        " FROM WEATHER " +
                                                        "  WHERE SENSOR_ID = :sensorId " +
                                                        "   AND CITY = :city " +
                                                        "   AND COUNTRY = :country " +
                                                        "   AND DATES BETWEEN :daysAgo AND :date " +
                                                        "  GROUP BY SENSOR_ID, CITY, COUNTRY";

    public static final String GET_WEATHER_NO_WS = "SELECT AVG(TEMPERATURE) AS TEMPERATURE," +
                                                    " AVG(HUMIDITY) AS HUMIDITY, " +
                                                    " SENSOR_ID, " +
                                                    " CITY, " +
                                                    " COUNTRY " +
                                                    " FROM WEATHER " +
                                                    "  WHERE SENSOR_ID = :sensorId " +
                                                    "   AND CITY = :city " +
                                                    "   AND COUNTRY = :country " +
                                                    "   AND DATES BETWEEN :daysAgo AND :date " +
                                                    "  GROUP BY SENSOR_ID, CITY, COUNTRY";

    public static final String GET_WEATHER_NO_TEM = "SELECT AVG(HUMIDITY) AS HUMIDITY, " +
                                                        " AVG(WIND_SPEED) AS WIND_SPEED, " +
                                                        " SENSOR_ID, " +
                                                        " CITY, " +
                                                        " COUNTRY " +
                                                        " FROM WEATHER " +
                                                        "  WHERE SENSOR_ID = :sensorId " +
                                                        "   AND CITY = :city " +
                                                        "   AND COUNTRY = :country " +
                                                        "   AND DATES BETWEEN :daysAgo AND :date " +
                                                        "  GROUP BY SENSOR_ID, CITY, COUNTRY";

    public static final String GET_WEATHER_TEM = "SELECT AVG(TEMPERATURE) AS TEMPERATURE," +
                                                    " SENSOR_ID, " +
                                                    " CITY, " +
                                                    " COUNTRY " +
                                                    " FROM WEATHER " +
                                                    "  WHERE SENSOR_ID = :sensorId " +
                                                    "   AND CITY = :city " +
                                                    "   AND COUNTRY = :country " +
                                                    "   AND DATES BETWEEN :daysAgo AND :date " +
                                                    "  GROUP BY SENSOR_ID, CITY, COUNTRY";

    public static final String GET_WEATHER_WS = "SELECT AVG(WIND_SPEED) AS WIND_SPEED, " +
                                                " SENSOR_ID, " +
                                                " CITY, " +
                                                " COUNTRY " +
                                                " FROM WEATHER " +
                                                "  WHERE SENSOR_ID = :sensorId " +
                                                "   AND CITY = :city " +
                                                "   AND COUNTRY = :country " +
                                                "   AND DATES BETWEEN :daysAgo AND :date " +
                                                "  GROUP BY SENSOR_ID, CITY, COUNTRY";

    public static final String GET_WEATHER_HUM = "SELECT AVG(HUMIDITY) AS HUMIDITY, " +
                                                    " SENSOR_ID, " +
                                                    " CITY, " +
                                                    " COUNTRY " +
                                                    " FROM WEATHER " +
                                                    "  WHERE SENSOR_ID = :sensorId " +
                                                    "   AND CITY = :city " +
                                                    "   AND COUNTRY = :country " +
                                                    "   AND DATES BETWEEN :daysAgo AND :date " +
                                                    "  GROUP BY SENSOR_ID, CITY, COUNTRY";

    public static final String CREATE_WEATHER = "CREATE TABLE Weather (  " +
            "    SENSOR_ID varchar(255),  " +
            "    CITY varchar(255),  " +
            "    COUNTRY varchar(255),  " +
            "    TEMPERATURE DECIMAL(5,2),  " +
            "    HUMIDITY DECIMAL(5,2),  " +
            "    WIND_SPEED DECIMAL(5,2),  " +
            "    DATES int,  " +
            "    PRIMARY KEY (SENSOR_ID, CITY, COUNTRY, DATES)  " +
            ") ";

    public static final String INSERT_VALUES = "INSERT INTO Weather     " +
            "      (TEMPERATURE, HUMIDITY, WIND_SPEED, DATES, SENSOR_ID, CITY, COUNTRY)     " +
            "     VALUES     " +
            "    ('10', '41', '08', '20220104', '1', 'Dublin', 'Ireland')";

    public static final String GET_WEATHER_UNIQUE = "SELECT *    " +
                                                    "    FROM WEATHER   " +
                                                    "     WHERE SENSOR_ID = :sensorId " +
                                                    "      AND CITY = :city  " +
                                                    "      AND COUNTRY = :country  " +
                                                    "      AND DATES = :date";


    public static final String GET_DATE = "SELECT POSTING_DATE FROM SYS_POSTING_DATE SPD WHERE SPD.INSTITUTION_NUMBER = '00000033' AND SPD.STATION_NUMBER = '129' ";

    public static final String GET_WEATHER = "SELECT AVG(TEMPERATURE) AS TEMPERATURE," +
                                                " AVG(HUMIDITY) AS HUMIDITY, " +
                                                " AVG(WIND_SPEED) AS WIND_SPEED, " +
                                                " SENSOR_ID, " +
                                                " CITY, " +
                                                " COUNTRY " +
                                                " FROM WEATHER " +
                                                "  WHERE SENSOR_ID = :sensorId " +
                                                "   AND CITY = :city " +
                                                "   AND COUNTRY = :country " +
                                                "   AND DATES BETWEEN :daysAgo AND :date " +
                                                "  GROUP BY SENSOR_ID, CITY, COUNTRY";


    public static final String UPDATE_WEATHER = "UPDATE WEATHER  " +
            "  SET TEMPERATURE = NVL(TEMPERATURE, :temperature), " +
            "   HUMIDITY = NVL(HUMIDITY, :humidity), " +
            "   WIND_SPEED = NVL(WIND_SPEED, :windSpeed) " +
            " WHERE SENSOR_ID =  :sensorId " +
            "  AND CITY = :city " +
            "  AND COUNTRY = :country" +
            "  AND DATES = :date";


    public static final String INSERT_WEATHER = "INSERT INTO WEATHER " +
            "  (TEMPERATURE, HUMIDITY, WIND_SPEED, DATES, SENSOR_ID, CITY, COUNTRY) " +
            " VALUES " +
            "(:temperature, :humidity, :windSpeed, :date, :sensorId, :city, :country)";


}
