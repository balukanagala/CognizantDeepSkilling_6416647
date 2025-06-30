package com.example.service;
import com.example.api.WeatherApi;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito; // Import Mockito static methods

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class WeatherServiceTest {

    // Dependency to be mocked
    private WeatherApi mockWeatherApi;  // Declared, but not yet initialized


    // The service we are testing
    private WeatherService weatherService;
    
    @BeforeEach
    void setUp() {
    	// step1
    	mockWeatherApi = Mockito.mock(WeatherApi.class); // Initializes mockWeatherApi with a mock object
    	//step2
    	// We can use the initialized mock to create our service
    	weatherService = new WeatherService(mockWeatherApi);
    }
    
    @Test
    void testGetWeatherReport() {
    	when(mockWeatherApi.getTemperature("vizag")).thenReturn(33.5);
    	// bcoz of the above statement
    	String expectedReport = "Current temperature in vizag is : 33.5";
    	String actualReport = weatherService.getWeatherReport("vizag");
    	assertEquals(expectedReport, actualReport,"weather report should match");
    }
}
