package com.example.service;
// This is CUT (class under test)

import com.example.api.WeatherApi;

public class WeatherService {
	private WeatherApi weatherApi; // object for WeatherApi, declared not initialized
	// Dependency is declared, but not created here
    public WeatherService(WeatherApi weatherApi) {
    	 // Dependency is "injected" via constructor
        this.weatherApi = weatherApi; // initialized here
    }
    /*
     * Above statement and Constructor:
     * This declares a private member variable named weatherApi of type WeatherApi. 
     * This variable will be used by the WeatherService to interact with an external weather API.*/
    public String getWeatherReport(String city) {
    	double temp = weatherApi.getTemperature(city);
    	// to access this, initialization is must, else it weatherApi will be null, and 
    	// run time error will be generated
    	String report = "Current temperature in "+city+" is : "+temp;
    	return report;
    }
}
