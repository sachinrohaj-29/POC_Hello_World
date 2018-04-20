package com.sachin.GenericStuff;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapCollectionPoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String[]> demoMap = new HashMap<String,String[]>();
		Map<String,Integer> demoMap1 = new HashMap<String,Integer>();
		
		demoMap1.put("abc", 100);
		demoMap1.put("abd", 200);
		demoMap1.put("abe", 300);
		demoMap1.put("abc", 400);
		
		System.out.println(demoMap1.size());
		
		String[] sac = {"000000002","000001245","00002222"};
		String[] sac1 = {"000000012","000001245","00002222"};
		String[] sac2 = {"000000022","000001245","00002222"};
		demoMap.put("1s", sac);
		demoMap.put("2s", new String[] {"00004567","00003467","00001572","000001258"});
		demoMap.put("3s", sac2);
		demoMap.put("1s", sac1);
		
		for (Entry<String, String[]> counter : demoMap.entrySet()){
			for(String val : counter.getValue()){
				System.out.println(counter.getKey() + "	" + val);
			}			
		}
	}

}
