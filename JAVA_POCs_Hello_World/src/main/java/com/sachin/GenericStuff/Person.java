package com.sachin.GenericStuff;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Person implements Comparable<Person>,Serializable,Cloneable{

	private String name;
	private Integer age;
	private int mobileNo; 
	private Course courses;
	private List<Integer> cars = new ArrayList<Integer>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Course getCourses() {
		return courses;
	}
	public void setCourses(Course courses) {
		this.courses = courses;
	}
	public List<Integer> getCars() {
		return cars;
	}
	public void setCars(List<Integer> cars) {
		this.cars = cars;
	}
	
	public Person(){}
	
	public Person(String name, Integer age){
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, Integer age, Course courses){
		super();
		this.name = name;
		this.age = age;
		this.courses = courses;
	}
	
	@Override
	public int compareTo(Person p) {
		// TODO Auto-generated method stub
		return this.name.compareToIgnoreCase(p.getName());
	}
	
	public Object Clone() throws CloneNotSupportedException{
		Person person = (Person)super.clone();
		person.courses = (Course)courses.clone();
		//Course courses = (Course)courses.clone();
		return person;
	}
	/*public String toString(){
		return this.name;
	}*/
	
}
