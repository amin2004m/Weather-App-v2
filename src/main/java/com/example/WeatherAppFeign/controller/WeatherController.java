package com.example.WeatherAppFeign.controller;

import com.example.WeatherAppFeign.dto.WeatherResponse;
import com.example.WeatherAppFeign.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @Value("${api.key}")
    private String apiKey;

    @GetMapping("{city}")
    public ResponseEntity<WeatherResponse> getWeather(@PathVariable String city) {
        WeatherResponse weatherResponse = weatherService.getWeather(city, apiKey);
        return ResponseEntity.ok(weatherResponse);
    }

}