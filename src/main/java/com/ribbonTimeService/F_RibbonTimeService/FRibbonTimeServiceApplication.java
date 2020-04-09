package com.ribbonTimeService.F_RibbonTimeService;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class FRibbonTimeServiceApplication {

	@Value("${server.port}")
	private int port;
	public static void main(String[] args) {
		SpringApplication.run(FRibbonTimeServiceApplication.class, args);
	}
	
	@GetMapping
	public String getTime() {
		return ("current time :"+new Date().toString()+ "/n Running on port:"+port);
	}

}
