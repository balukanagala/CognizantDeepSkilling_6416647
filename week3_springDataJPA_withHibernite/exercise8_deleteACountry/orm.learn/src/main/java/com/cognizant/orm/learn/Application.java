package com.cognizant.orm.learn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext; // [cite: 681]

import com.cognizant.orm.learn.model.Country;
import com.cognizant.orm.learn.Service.CountryService; //

@SpringBootApplication
public class Application {

	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
	private static CountryService countryService; // [cite: 672]

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args); // [cite: 681]
		countryService = context.getBean(CountryService.class); // [cite: 682]

		LOGGER.info("Inside main");// [cite: 683]
		deleteCountryTest();
	}

	private static void deleteCountryTest(){
		LOGGER.info("Start");
		countryService.deleteCountry("AT");
		LOGGER.info("End");
	}
}