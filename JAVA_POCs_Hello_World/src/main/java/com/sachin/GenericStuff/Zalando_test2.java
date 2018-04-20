package com.sachin.GenericStuff;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Zalando_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "this is  happening now. i think so! you tell? let us try.";
		String[] s1 = s.split("\\.|\\?|!");
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		for(int j=0; j<s1.length; j++){
			System.out.println(s1[j].trim());
			String s2 = s1[j].trim();
			int count = 1;
			for(int i=0; i<s2.length(); i++){
				/*String[] ss = s2.split("\\s+");
				for(String p : ss){
					count++;
				}*/
				if(s2.trim().charAt(i) == ' ' && s2.trim().charAt(i-1) != ' '){
					count++;
				}
			}
			map.put(s1[j], count);
		}	
			
		System.out.println(map);
		
		int max=Collections.max(map.values());
		System.out.println(max);
			
			/*String[] s2 = s.split("\\s+");
			for(String s3 : s2){
				//System.out.println(s3);
			}*/
		}

		
	}