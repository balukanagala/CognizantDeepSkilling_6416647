package com.example.junit.exercise3_assertions;

public class Assertions {
	// for equality assertions,floating point
	public int add(int a,int b) {
		return a+b;
	}
	
	public float addFloat(float a,float b) {
		return a+b;
	}
	// for boolean assertions
	public boolean isPositive(int n) {
		return n>0;
	}
	// array/collection assertions
	public int[] getArray() {
		return new int [] {1,2,3};
	}
	// exception assertions
	public float div(int a,int b) {
		if(b==0) throw new IllegalArgumentException("Cannot divide by zero");
		if(a==0 && b<0) return -(float)a/b;
		return (float)a/b;
	}
	// identity assertions
	public Object getSameObject(Object obj) {
		return obj;
	}
	public Object getNewObject(Object obj) {
		return new Object();
	}
}
