package com.sachin.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Songs s1 = new Songs("abc", 3.20, "folk", "nusrat");
		Songs s2 = new Songs("def", 4.20, "edm", "tiesto");
		Songs s3 = new Songs("lmn", 5.20, "sufi", "rahat");
		Songs s4 = new Songs("pqr", 3.10, "fusion", "paki");
		Songs s5 = new Songs("acb", 3.00, "rock", "bon zovi");
		Songs s6 = new Songs("acbd", 13.00, "rock", "bon zovi");
		
		List<Songs> songList = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5,s6));		
		
		Collections.sort(songList, ComparatorSamples.genereComp);
		songList.stream().forEach(System.out::println);
				
		//=============================================================================
		List<Integer> intList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,2,3));		
		Map<Integer,Integer> intCount = new HashMap<Integer,Integer>();
				  
		for(int i : intList){			
			if(intCount.containsKey(i)){
				intCount.put(i, intCount.get(i)+1);
			}
			else{
				intCount.put(i, 1);
			}
		}
		
		for(java.util.Map.Entry<Integer, Integer> entry: intCount.entrySet()){
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		//=============================================================================
		HashMap<Songs,Integer> songCount = new HashMap<Songs,Integer>();
		for(Songs i : songList){			
			if(songCount.containsKey(i)){
				System.out.println("in loop: " + i + " : "+ intCount.get(i));
				songCount.put(i, songCount.get(i)+1);
			}
			else{
				songCount.put(i, 1);
			}
		}
		
		for(java.util.Map.Entry<Songs, Integer> entry: songCount.entrySet()){
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		//=============================================================================
	}

}
