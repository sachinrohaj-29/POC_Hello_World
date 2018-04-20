package com.sachin.cloning;

public class Student implements Cloneable{

	private String name;
	private int age;
	private Degree degree;
	
	
	public Student(String name, int age, Degree degree) {
		super();
		this.name = name;
		this.age = age;
		this.degree = degree;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Degree getDegree() {
		return degree;
	}
	public void setDegree(Degree degree) {
		this.degree = degree;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", degree=" + degree + "]";
	}
	
	public Object clone() throws CloneNotSupportedException{
		Student std = (Student)super.clone();
		std.degree = (Degree)degree.clone();
		return std;
	}
}
