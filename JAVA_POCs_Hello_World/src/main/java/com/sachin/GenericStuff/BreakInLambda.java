package com.sachin.GenericStuff;

import java.util.ArrayList;
import java.util.List;

public class BreakInLambda {

	public static void main(String[] args) {
	List<Person> people = new ArrayList<Person>();
	List<Integer> cars = new ArrayList<Integer>();
	cars.add(1);
	cars.add(3);
	
	Person p1 = new Person("a",20);
	p1.setCars(cars);
	Person p2 = new Person("b",30);
	Person p3 = new Person("c",40);
	
	people.add(p1);
	people.add(p2);
	people.add(p3);
	
	people.stream().forEach(action -> {
		if(null != action){
			System.out.println("in loop1: " + action);
			action.getCars().stream().forEach(action1 -> {
				if(action1 != null){
					if(action1 == 3){
					System.out.println("in loop2:" + action1);
					
					}
				}
			});
		}
	});
	}
}
