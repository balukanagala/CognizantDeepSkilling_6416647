package com.cognizant.sprring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class SprringLearnApplication {

	private static final Logger logger = LoggerFactory.getLogger(SprringLearnApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(SprringLearnApplication.class, args);
		logger.info("inside main");
	}

}
