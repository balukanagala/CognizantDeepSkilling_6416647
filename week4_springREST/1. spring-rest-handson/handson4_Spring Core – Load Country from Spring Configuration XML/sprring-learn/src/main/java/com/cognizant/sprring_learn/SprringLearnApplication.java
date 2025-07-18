package com.cognizant.sprring_learn;

import com.cognizant.sprring_learn.models.Country;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SprringLearnApplication {

	private static final Logger logger = LoggerFactory.getLogger(SprringLearnApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(SprringLearnApplication.class, args);
		logger.info("inside main");
		displayCountry();
	}
	public static void displayCountry(){
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country c = context.getBean("country", Country.class);
		logger.debug("Country : {}",c.toString());
	}

}
