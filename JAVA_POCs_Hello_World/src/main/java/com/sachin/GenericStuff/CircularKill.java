package com.sachin.GenericStuff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircularKill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ll = new ArrayList<Integer>();
		List<String> ls = new ArrayList<>(Arrays.asList("sachin","rohaj","singh","finally"));
		
		for(int i=1; i<=100 ; i++){
			ll.add(i);
		}
			
		for(int i=0; i<ll.size(); i++){
			if(ll.get(i)%5 == 0){				
				ll.remove(i);				
			}
		}
		
		/*ll.forEach(new Consumer(){
			
		});*/
		
		for(int i : ll){			
			System.out.print(i + " ");
		}
		//kill(ll);
	}
	
	private static void kill(List<Integer> ll){
		System.out.println(ll.size());
		boolean isLastFlag = false;
		
		for(int i=0; i<ll.size(); i++){
			if((i+1) < ll.size()){
				ll.remove(i+1);
				if((i+1) == (ll.size()-1)){
					isLastFlag = true;
				}
				
				if(isLastFlag)
					ll.remove(i);
				else
					ll.remove(i+1);
			}			
			
			if(ll.size() == 1)
				break;			
		}
		for(int i : ll){
			System.out.print(i + " ");
		}
		//System.out.println(ll.size());
		if(ll.size() > 1)
			kill(ll);
	}

}
