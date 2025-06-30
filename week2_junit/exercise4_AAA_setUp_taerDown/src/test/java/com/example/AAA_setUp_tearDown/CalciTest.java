package com.example.AAA_setUp_tearDown;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalciTest {
	// Arrange 
	Calci c;
	@BeforeAll
	static void beforeAll() {
		System.out.println("Executes before all the tests");
	}
	@BeforeEach
	void setUp() {
		System.out.println("Executes for every test");
		System.out.println("Creating new calci obj for every test (Arranging for each test case)");
		c = new Calci();
	}
	@AfterEach
	void tearDown() {
		System.out.println("Executes after every test");
		System.out.println("Removing reference of obj after every test");
		c = null;
	}
	@AfterAll
	static void afterAll() {
		System.out.println("Executes after all the tests");
	}
	
	//Act
	@Test
	@DisplayName("Checking Addition with mixed nums")
	void checkAdd() {
		int res = c.add(2,-3);
		int actual = -1;
		// Assert
		assertEquals(actual,res,"Addition of 2 and -3 should be -1");
	}
	
	@Test
	@DisplayName("Checking Subtraction with mixed nums")
	void checkSub() {
		int res = c.sub(2,-3);
		int actual = 5;
		assertEquals(actual,res,"Subtraction of -3 from 2 should be 5");
	}
}
