package com.example.WeatherAppFeign.service;

import com.example.WeatherAppFeign.client.WeatherClient;
import com.example.WeatherAppFeign.dto.WeatherResponse;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class WeatherService {

    WeatherClient weatherClient;

    public WeatherResponse getWeather(String city, String apiKey) {
        ResponseEntity<WeatherResponse> response = weatherClient.getWeather(city, apiKey,"metric");
        return response.getBody();
    }
}