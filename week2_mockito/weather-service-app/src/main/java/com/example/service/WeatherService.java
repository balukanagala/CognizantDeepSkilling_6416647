package com.example.service;
// This is CUT (class under test)

import com.example.api.WeatherApi;

public class WeatherService {
	private WeatherApi weatherApi;
    public WeatherService(WeatherApi weatherApi) {
        this.weatherApi = weatherApi;
    }
    public String getWeatherReport(String city) {
    	double temp = weatherApi.getTemperature(city);
    	String report = "Current temperature in "+city+" is : "+temp;
    	return report;
    }
}
