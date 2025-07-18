package com.cognizant.sprring_learn.controller;

import com.cognizant.sprring_learn.models.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CountryController {
    private static final Logger logger = LoggerFactory.getLogger(CountryController.class);
    @RequestMapping(value="/country",method = RequestMethod.GET)
    @ResponseBody
    public Country getCountryIndia(){
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country c = context.getBean("country", Country.class);
        return c;
    }
}
