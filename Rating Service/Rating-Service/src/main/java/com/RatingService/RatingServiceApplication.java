package com.RatingService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

@SpringBootApplication
public class RatingServiceApplication {
@LoadBalanced
	public static void main(String[] args) {
		SpringApplication.run(RatingServiceApplication.class, args);
	}

}
