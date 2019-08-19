package com.eor.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.spring5.SpringTemplateEngine;

import nz.net.ultraq.thymeleaf.LayoutDialect;

@SpringBootApplication
public class PetroleumSoftEoRsApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(PetroleumSoftEoRsApplication.class, args);
	}

}
