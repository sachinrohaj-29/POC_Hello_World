package com.sachin.GenericStuff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TSYS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Person1,Person1> myMap = new HashMap<Person1,Person1>();
		Person1 p1 = new Person1("Alex",99);
		Person1 p2 = new Person1("William",100);
		Person1 p3 = new Person1("Alex",101);
		
		myMap.put(p1, p1);
		myMap.put(p2, p2);
		//myMap.put(p3, p3);
		
		System.out.println(myMap.get(p3));
		String aaa = "this is three" + 2 + 3 + "and four";
		System.out.println(aaa);

		System.out.println(p1.getName()==p3.getName());
		p1.show("10");		
		p1.show(10);
		p1.show(10.23);
		
		List<Integer> ll = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		List<String> ls = new ArrayList<>(Arrays.asList("sachin","singh","rohaj","me","you"));
		ll.stream().forEach(System.out::println);
		
		for(int i=0; i<ll.size(); i++){
			//System.out.println("in loop 1");
			if(i == 2){
				//System.out.println("in if 1");
				ll.add(10);
			}
							
		}
		
		System.out.println();
		
		Iterator<Integer> iterate = ll.iterator();
		while(iterate.hasNext()){
			Integer j = iterate.next();
			if(j == 5){
				iterate.remove();
			}			
		}
		ll.stream().forEach(System.out::println);
		
		for(int i : ll){
			//System.out.println("in loop 2");
			if(i == 10){
				//System.out.println("in if 2");
				ll.remove(9);
			}
				
		}
		
		ll.stream().forEach(System.out::println);
		
		//System.out.println(null);
		/*Set<Person1> bookSet = new HashSet<Person1>();
		bookSet.add(p1);
		bookSet.add(p2);
		bookSet.add(p3);
		System.out.println(bookSet.contains(p1));
		
		myMap.get(p1);
		
		System.out.println(myMap.get(p2));
		System.out.println(myMap.get(p2).hashCode());
		
		String aaa = "one " + 2+3+" and four " +5+6;
		System.out.println(aaa);*/
		//System.out.println(null);
		//System.out.println(p1.name == p3.name);
	}

}

class Person1{
	final String name;
	final int age;
	
	public Person1(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String toString(){
		return this.name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public void show(int i){
		System.out.println("In int: " + i);
	}
	
	public void show(Object o){
		System.out.println("In Obj: " + o);
	}
	
	public void show(String o){
		System.out.println("In String: " + o);
	}
	
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Person1 other = (Person1) obj;
		if(name ==null){
			if(other.name != null)
				return false;
		}
		else if(!name.equals(other.name))
			return false;
		return true;
		
	}
}