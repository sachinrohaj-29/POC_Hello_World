package com.sachin.GenericStuff;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComparableANDComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List ll = new ArrayList();
		ll.add(1);
		ll.add("sachin");
		Person pp = new Person("sachinaftersometime",45);
		System.out.println(ll.get(0).getClass());
		System.out.println(ll.get(1).getClass());
		
		// This will break in run time
		//Collections.sort(ll);
		//System.out.println(ll);
		
		Map mm = new HashMap();
		mm.put(1, "sachin");
		//System.out.println(mm);
		
		//========================Comparable===============================
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("sahcin",24));
		people.add(new Person("sahcinSingh",23));
		
		Collections.sort(people);
		people.stream().map(p -> p.getName()).forEach(System.out::println);
		
		
		//==========================Comparator==============================		
		/*class PersonAgeComparator implements Comparator<Person>{

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getAge().compareTo(o2.getAge());
			}
			
		}
		
		Collections.sort(people, new PersonAgeComparator());*/
		
		Collections.sort(people, new Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getAge().compareTo(o2.getAge());
			}
			
		});
		people.stream().map(p -> p.getAge()).forEach(System.out::println);
		
		//==========================lambda Comparator==============================
		Collections.sort(people, (o1,o2) -> o1.getAge().compareTo(o2.getAge()));
		people.stream().map(p -> p.getName()).forEach(System.out::println);
		
		
		//==========================lambda Stream Comparator==============================
		Person pers = people.stream().max((o1,o2) -> o1.getAge().compareTo(o2.getAge())).get();
		System.out.println(pers.getAge());
		
		
		
	}

}
