package com.sachin.cloning;

public class TestingCLoning {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Degree degree1 = new Degree("rohtak","engineering","IT");
		Student sachin = new Student("sachin",29,degree1);
		
		System.out.println("Before CLoning: ");
		System.out.println(sachin);
		
		Student naveen = (Student)sachin.clone();
		Degree degree2 = new Degree("panipat","engineering","Computers");
		naveen.setName("Naveen");
		naveen.getDegree().setStream("Computers");
		
		System.out.println("\nAfter CLoning: ");
		System.out.println(sachin);
		System.out.println(naveen);
		
		String name = "Priya";
		name.intern();
		System.out.println(name.valueOf(true));
	}

}
