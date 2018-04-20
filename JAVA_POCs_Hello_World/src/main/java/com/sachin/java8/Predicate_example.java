package com.sachin.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Predicate_example {
	public static void main(String[] args) {		
		List<Integer> ll = Arrays.asList(1,2,3,4,5,6,7,8,9);	
		
		//--------------  Conventional Way --------------		
		List<Integer> llc = new ArrayList<Integer>();;
		for(int i : ll){
			if(i>3 && i%5==0 && i<10){
				llc.add(i);
			}			
		}		
		// Enhanced for loop
		for(int i: llc){
			System.out.println(i);
		}
		
		// -------------- JAVA 8 way --------------		
		// Predicates makes our code more modular and reusable at the same time.
		List<Integer> llj8 = ll.stream().
				filter(i -> i>3 && i%5==0 && i<10).
				collect(Collectors.toList());		
		llj8.forEach(System.out::println);
		
		// -------------- JAVA 8 more modular way --------------		
		// Predicates makes our code more modular and reusable at the same time.
		List<Integer> llj8m = ll.stream().
				filter(PredicateSamples.greaterThanThree.and(PredicateSamples.divisibleByFiveLessThanTen)).
				collect(Collectors.toList());		
		llj8m.forEach(System.out::println);
	}
}


