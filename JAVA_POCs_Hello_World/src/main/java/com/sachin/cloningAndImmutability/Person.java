package com.sachin.cloningAndImmutability;

import java.io.Serializable;

import com.sachin.GenericStuff.Course;

public final class Person {

	private final String name = "naveen";
	private final Integer age = 40;
	private final int mobileNo = 78755517; 
	private final Degree courses = new Degree("english","hindi","sanskrit");;
	
	public String getName() {
		return name;
	}	
	public Integer getAge() {
		return age;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public Degree getCourses() {
		return courses;
	}
	
	public Person(){}
	
	/*public Person(String name, Integer age){
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, Integer age, Degree courses){
		super();
		this.name = name;
		this.age = age;
		this.courses = courses;
	}*/
	
	/*@Override
	public int compareTo(Person p) {
		// TODO Auto-generated method stub
		return this.name.compareToIgnoreCase(p.getName());
	}*/
	
	/*public Object Clone() throws CloneNotSupportedException{
		Person person = (Person)super.clone();
		person.courses = (Course)courses.clone();
		//Course courses = (Course)courses.clone();
		return person;
	}*/
}
