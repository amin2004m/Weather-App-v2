package com.example.WeatherAppFeign.client;


import com.example.WeatherAppFeign.dto.WeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "weatherClient", url = "https://api.openweathermap.org/data/2.5")
public interface WeatherClient {

    @GetMapping("/weather")
    ResponseEntity<WeatherResponse> getWeather(@RequestParam("q") String city,
                                               @RequestParam("appid") String apiKey,
                                               @RequestParam("units") String units);

}
