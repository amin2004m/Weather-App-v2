package com.example.WeatherAppFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WeatherAppFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherAppFeignApplication.class, args);
	}

}
