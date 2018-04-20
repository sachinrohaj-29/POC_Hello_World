package com.sachin.GenericStuff;

public class CloningPOC {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Course courses = new Course("english", "hindi", "maths");
		Person ps = new Person("sachin",23,courses);
		System.out.println(ps.getName()+ " " + ps.getAge()+ " " + ps.getCourses().getSubject1()+ " " + ps.getCourses().getSubject2());
		Person ps2;
		
		ps2 = (Person)ps.Clone();
		ps2.setName("sumit");
		ps2.setAge(40);
		ps2.getCourses().setSubject1("physics");
		System.out.println(ps2.getName()+ " " + ps2.getAge()+ " " + ps2.getCourses().getSubject1()+ " " + ps2.getCourses().getSubject2());
		
		System.out.println(ps.getName()+ " " + ps.getAge()+ " " + ps.getCourses().getSubject1()+ " " + ps.getCourses().getSubject2());
		//System.out.println(ps2.hashCode());
	}

}
