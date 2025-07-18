package com.cognizant.sprring_learn.models;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;



public class Country {
    private static final Logger logger = LoggerFactory.getLogger(Country.class);
    private String name;
    private String code;

    public String getName() {
        logger.debug("Inside getName");
        return name;
    }

    public void setName(String name) {
        logger.debug("Inside setName");
        this.name = name;
    }

    public String getCode() {
        logger.debug("Inside getCode");
        return code;
    }

    public void setCode(String code) {
        logger.debug("Inside setCode");
        this.code = code;
    }

    public Country() {
        logger.debug("Inside default constructor");
    }

    @Override
    public String toString() {
        logger.debug("inside toString");
        return "Country{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
