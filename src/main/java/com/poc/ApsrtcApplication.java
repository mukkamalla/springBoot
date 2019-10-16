package com.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@EnableConfigurationProperties(DataSourceProperties.class)
	public class ApsrtcApplication {

		public static void main(String[] args) {
			SpringApplication.run(ApsrtcApplication.class, args);
		}

	} 


