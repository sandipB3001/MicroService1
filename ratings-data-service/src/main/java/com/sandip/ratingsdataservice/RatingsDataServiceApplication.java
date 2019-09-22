package com.sandip.ratingsdataservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RatingsDataServiceApplication {

//	private static final Logger logger = LoggerFactory.getLogger(RatingsDataServiceApplication.class);
//	   public void log(){
//	      logger.info("log4j is work");
//	   }
	public static void main(String[] args) {
		SpringApplication.run(RatingsDataServiceApplication.class, args);
	}

}
