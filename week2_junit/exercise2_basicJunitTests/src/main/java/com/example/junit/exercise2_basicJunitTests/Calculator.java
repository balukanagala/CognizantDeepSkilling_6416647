package com.example.junit.exercise2_basicJunitTests;

public class Calculator {
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public float div(int a,int b) {
		if(b==0) {
			throw new IllegalArgumentException("Cannot divide by zero");
		}
		if(a==0 && b<0)	return -(float)a/b;
		return (float)a/b;
	}
}
