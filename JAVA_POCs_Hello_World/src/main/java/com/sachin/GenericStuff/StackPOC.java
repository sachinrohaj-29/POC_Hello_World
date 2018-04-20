package com.sachin.GenericStuff;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackPOC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> st = new Stack<Integer>();
		
		st.push(1);
		st.push(2);
		st.push(3);
		
		System.out.println(st);
		
		List ll = new ArrayList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		
		ll.stream().forEach(i -> System.out.println(i));
	}

}
