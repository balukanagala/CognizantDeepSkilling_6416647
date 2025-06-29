package com.example.junit.exercise3_assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {
	Assertions a; 
	@BeforeEach
	void setUp() {
		a = new Assertions();
	}
	
	@Test
	@DisplayName("Checking Equality Assertions")
	void checkEqualityAssertion() {
		int res = a.add(2, 3);
		assertEquals(5,res); 
		int res1 =  a.add(-2, -3);
		assertNotEquals(5,res1);
	}
	
	@Test
	@DisplayName("Checking FloatingPoint Assertions")
	void checkFloatingPointAssertion() {
		float res = a.addFloat(0.1f,0.2f);
		assertEquals(0.3f,res,1e-9f);
		// even assertEquals is being passed here
		// but for floating point calcs, use assertEquals with delta paramenter
	}
	
	@Test
	@DisplayName("Checking boolean Assertions")
	void checkBooleanAssertion() {
		assertTrue(a.isPositive(5));
		assertFalse(a.isPositive(0));
	}
	
	@Test
	@DisplayName("Checking exception assertion")
	void checkExceptionAssertion() {
		assertThrows(IllegalArgumentException.class, () -> {a.div(5, 0);});
	}
	
	@Test
	@DisplayName("Checking collection assertions")
	void checkArrayAssertion() {
		int []res = a.getArray();
		int [] actual = new int [] {1,2,3};
		assertArrayEquals(res,actual);
	}
	
	@Test
	@DisplayName("Checking Identity assertions")
	void checkIdentityAssertion() {
		Object obj1 = new Object();
		assertSame(obj1,a.getSameObject(obj1));
		Object obj2 = obj1;
		assertSame(obj1,a.getSameObject(obj2));
		
		Object obj3 = new Object();
		assertNotSame(obj1,obj3);
		assertNotSame(obj1,a.getNewObject(obj1));	
	}
	/*
	* In Java, Object is a predefined class.
	It is the root of the class hierarchy. 
	This means that every class in Java, whether it's a class you write or a class provided by the Java API 
	(like String, Integer, ArrayList, Thread, etc.), directly or indirectly inherits from the Object class.
	Every class we write automatically extends from Object Class.
	
	assertSame is typically used for custom objects or when strict identity matters.
	*/
	
	@Test
	@DisplayName("Checking nullity assertions")
	void checkNullityAssertion() {
		String nullString = null;
		String notNullString ="Hello";
		assertNull(nullString);
		assertNotNull(notNullString);
	}
}