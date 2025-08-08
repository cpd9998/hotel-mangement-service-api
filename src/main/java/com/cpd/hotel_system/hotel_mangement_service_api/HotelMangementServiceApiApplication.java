package com.cpd.hotel_system.hotel_mangement_service_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HotelMangementServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelMangementServiceApiApplication.class, args);
	}

}
