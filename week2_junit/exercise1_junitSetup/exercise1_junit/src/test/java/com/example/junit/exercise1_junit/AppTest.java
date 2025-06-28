package com.example.junit.exercise1_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;



public class AppTest {

	@BeforeEach
	void setUp() {
		System.out.println("This is Test Classs");
	}
    @Test
    @DisplayName("should return true")
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
