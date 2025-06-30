package com.example.api;
// this is the api on which cut(class under test is dependent)
public interface WeatherApi {
	double getTemperature(String city);
}
