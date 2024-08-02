package com.zomatoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
@EntityScan("com.zomatoapp.model")
public class ZomatodemoSandeepHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZomatodemoSandeepHotelApplication.class, args);
	}
	
	

}
