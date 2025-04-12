package com.git.learning;
// e git   using git with eclips and black screen
public class Calculator {
	
	
	
	public int add(int x,int y) {
		return x+y;
		
		
	}

	public int divide(int x,int y) {
		int result =0;
		if(y! = 0) {
			
		result = x/y;
		}else {
			throw new Exception("you can not divide num by zero")
		}
	}
}
