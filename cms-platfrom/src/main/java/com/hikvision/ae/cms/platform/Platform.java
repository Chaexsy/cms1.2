package com.hikvision.ae.cms.platform;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
//@ComponentScan(basePackages = {"com.hikvision.ae.cms.service.*"})
public class Platform {

	public static void main(String[] args) {
		SpringApplication.run(Platform.class, args);
	}

}
