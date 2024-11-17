package com.example.WeatherAppFeign.dto;

import lombok.Data;

@Data
public class WeatherResponse {
    private Main main;
    private String name;

    @Data
    public static class Main {
        private double temp;
        private double pressure;
        private double humidity;

    }

}