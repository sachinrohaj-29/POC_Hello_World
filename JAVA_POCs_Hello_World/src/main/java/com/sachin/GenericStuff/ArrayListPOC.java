package com.sachin.GenericStuff;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPOC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ll = new ArrayList<Integer>(100);
		System.out.println(ll.size());
		ll.add(0, 10);
		System.out.println(ll.size());
		
		int a=10;
		int b=20;
		System.out.println(a/b);
		System.out.println(a%b);
	}

}
