package com.example.junit.exercise2_basicJunitTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class calculatorTest {
	Calculator calci;
	
	/*
	 * This method runs before all the tests
	 */
	@BeforeEach
	void setUp() {
		calci = new Calculator();
	}
// ADDITION TESTS
	@Test
	@DisplayName("should add two positive nums correctly")
	void testAddPositiveNumbers() {
		int res = calci.add(3, 5);
		assertEquals(8,res,"Addition of 3 and 5 should be 8");
	}
	
	@Test
	@DisplayName("should add two negative nums correctly")
	void testAddNegativeNumbers() {
		int res = calci.add(-3, -5);
		assertEquals(-8,res,"Addition of -3 and -5 should be -8");
	}
	
	@Test
	@DisplayName("should add mixed nums correctly")
	void testAddMixedNumbers() {
		int res = calci.add(3, -5);
		assertEquals(-2,res,"Addition of 3 and -5 should be -2");
	}
	
	@Test
	@DisplayName("should add to zero correctly")
	void testAdditionWithZero() {
		int res = calci.add(0, -5);
		assertEquals(-5,res,"Addition of 0 and -5 should be -5");
	}
// SUBTRACTION TESTS	
	@Test
	@DisplayName("should subtract two positive nums correctly")
	void testSubPositiveNumbers() {
		int res = calci.sub(3, 5);
		assertEquals(-2,res,"Subtraction of 3 and 5 should be -2");
	}
	
	@Test
	@DisplayName("should subtract two negative nums correctly")
	void testSubNegativeNumbers() {
		int res = calci.sub(-3, -5);
		assertEquals(2,res,"Subtraction of -3 and -5 should be 2");
	}
	
	@Test
	@DisplayName("should subtract mixed nums correctly")
	void testSubMixedNumbers() {
		int res = calci.sub(3, -5);
		assertEquals(8,res,"Subtraction of 3 and -5 should be 8");
	}
	
	@Test
	@DisplayName("should subtract from zero correctly")
	void testSubWithZero() {
		int res = calci.sub(0, -5);
		assertEquals(5,res,"Subtraction of -5 and 0 should be 5");
	}
// MULTIPLICATION TESTS
	@Test
	@DisplayName("should multiply mixed nums correctly")
	void testMulMixedNums() {
		int res = calci.mul(5,3);
		assertEquals(15,res,"Multiplication of 5 and 3 should be 15");
	}
	
	@Test
	@DisplayName("should multiply with zero correctly")
	void testMulWithZero() {
		int res = calci.mul(5,0);
		assertEquals(0,res,"Multiplication of 5 and 0 should be 0");
	}
// DIVISION TESTS
	@Test
	@DisplayName("should divide mixed nums correctly")
	void testDivMixedNumsS() {
		float res = calci.div(5, -2);
		assertEquals(-2.5,res,"Division of 5 and -2 should be -2.5");
	}
	
	@Test
	@DisplayName("should divide numerator zero correctly")
	void testDivNumrZero() {
		float res = calci.div(0, -2);
		assertEquals(-0,res,"Division of 0 and -2 should be -0");
		
		float res1 = calci.div(0, 2);
		assertEquals(0,res1,"Division of 0 and 2 should be 0");
		
	}
	
	@Test
	@DisplayName("should raise an error when denominator is zero")
	void testDivDenmrZero() {
		 Exception exception = assertThrows(IllegalArgumentException.class, () -> {calci.div(10, 0)
			 ;});
		assertEquals("Cannot divide by zero",exception.getMessage(),"Exception message should match");
	}

}
