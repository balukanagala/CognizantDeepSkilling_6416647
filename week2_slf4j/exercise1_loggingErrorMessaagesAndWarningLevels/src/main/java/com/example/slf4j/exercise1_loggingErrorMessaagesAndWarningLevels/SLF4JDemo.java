package com.example.slf4j.exercise1_loggingErrorMessaagesAndWarningLevels;
//Import the SLF4J Logger and LoggerFactory interfaces
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SLF4JDemo {
	private static final Logger logger = LoggerFactory.getLogger(SLF4JDemo.class);
	
	public static void main(String args[]) {
		logger.debug("This is a debug message");
		logger.info("Application Started successfully");
		
		// warning
		int val=-1;
		if(val<0) {
			logger.warn("val is negative.Check once");
		}
		//error
		logger.error("Failed to connect to database");
		try {
			int res = 10/0;
		}
		catch(ArithmeticException e) {
			logger.error("An error occured. Division by zero");
		}
		logger.info("Application finished");
	}
	
}
