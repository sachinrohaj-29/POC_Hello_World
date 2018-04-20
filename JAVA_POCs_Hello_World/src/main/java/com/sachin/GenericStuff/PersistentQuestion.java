package com.sachin.GenericStuff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersistentQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ll = new ArrayList<Integer>();
		/*for(int i=0; i<10; i++){
			ll.add((int)(Math.random()*10));
		}
		
		for(int i : ll){
			System.out.println(i);
		}*/
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		
		ll.add(0);
		
		ll.add(3);
		ll.add(2);
		ll.add(1);
		ll.add(5);
		ll.add(5);
		
		Collections.sort(ll);
		/*for(int i : ll){
			int index = ll.indexOf(i);
			System.out.println("Index is: " + index + " " + i);
			if(i > 1 && i < ll.size() -2 && (ll.get(index-1) != i || ll.get(index-1) != i)){
			//	System.out.println(i);
			}
		}*/
		for(int i=0 ; i<ll.size(); i++){
			int index = 0;
			//System.out.println("Index is: " + index + " " + i);
			if(i > 0 && i < ll.size()-1 && (ll.get(i-1) == ll.get(i) || ll.get(i+1) == ll.get(i))){}
			else if (i == 0 && (ll.get(i+1) == ll.get(i))){}
			else if (i == ll.size()-1 && (ll.get(i-1) == ll.get(i))){}
			else
				System.out.println(ll.get(i));
		}
		
		//System.out.println(ll.get(2));
		
	}

}
