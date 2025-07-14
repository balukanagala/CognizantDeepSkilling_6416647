package com.cognizant.orm.learn.model;

import jakarta.persistence.*;

@Entity //
@Table(name="country") //
public class Country {

    @Id //
    @Column(name="co_code") // [cite: 640, 651]
    private String code;

    public Country() {
    }

    @Column(name="co_name") // [cite: 642, 651]
    private String name;

    // Generate Getters and Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country(String name, String code) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
}