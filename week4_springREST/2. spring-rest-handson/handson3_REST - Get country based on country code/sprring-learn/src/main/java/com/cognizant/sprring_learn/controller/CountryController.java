package com.cognizant.sprring_learn.controller;

import com.cognizant.sprring_learn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.sprring_learn.models.Country;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/country/{code}")
    public Country getCountryWithCode(@PathVariable("code") String code){
        return countryService.getCountry(code);
    }
}
