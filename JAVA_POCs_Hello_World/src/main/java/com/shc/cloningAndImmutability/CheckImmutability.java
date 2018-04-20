package com.shc.cloningAndImmutability;

public class CheckImmutability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Degree degree1 = new Degree("hindi","english","maths");
		
		//Person p1 = new Person("sachin",40,degree1);
		Person p1 = new Person();
		
		System.out.println(p1.getCourses());
		
		degree1.setSubject3("science");
		System.out.println(p1.getCourses());
	}

}
