package com.sachin.java8;

import java.util.function.Predicate;

public class PredicateSamples {

	// With boiler plate code
	public static Predicate<Integer> greaterThanThree = new Predicate<Integer>(){
		@Override
		public boolean test(Integer t) {
			// TODO Auto-generated method stub
			return t > 3;
		}		
	};

	// Without boiler plate code, the java 8 way
	public static Predicate<Integer> divisibleByFiveLessThanTen = (i -> (i%5==0) && i<10);
	
	
	
	
		
}
