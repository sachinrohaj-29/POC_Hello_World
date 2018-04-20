package com.sachin.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ll = new ArrayList(Arrays.asList(1,2,3,4,5,6,7));
		
		List<Double> l2 = ll.stream().map(l -> Math.pow(2, l)).collect(Collectors.toList());
		
		//l2.stream().forEach(System.out::println);
		
		int[] arr = new int[]{1,2,3,2,3,2,4,5,6,7};		
		
		//List<Integer> ll3 = new ArrayList(Arrays.asList(arr));		
		
		
		// Approach 1: When array is not sorted. Complexity O(n^2)
		int[] uniArr = new int[10];
		int sizeCounter=0;
		uniArr[0] = arr[0];
		for(int i=1; i<arr.length; i++){
			boolean uniFlag= true;
			for(int j=0; j<uniArr.length; j++){
				if(arr[i] == uniArr[j]){
					uniFlag = false;
					//System.out.println("arr: " + arr[i] + ", uniArr: " + uniArr[j]);
					break;
				}
			}
			if(uniFlag){
				//System.out.println("After for --> " + "arr: " + arr[i] + ", uniArr: " + uniArr[sizeCounter]);
				sizeCounter++;				
				uniArr[sizeCounter] = arr[i]; 
			}
			//System.out.println(arr[i] + " -> " + sizeCounter);			
		}
		
		/*for(int i : uniArr){
			System.out.println(i);
		}
		System.out.println("\n" + sizeCounter);*/
		
		
		// Approach 2: When array is sorted. Complexity O(n)
		Arrays.sort(arr);
		int[] uniSortArr = new int[10];
		int newCounter=0;
		uniSortArr[0] = arr[0]; 
		for(int i=0; i<arr.length; i++){
			if(arr[i] != uniSortArr[newCounter]){
				newCounter++;
				uniSortArr[newCounter] = arr[i] ;
			}
		}
		for(int i : uniSortArr ){
			System.out.println(i);
		}
		System.out.println("\n" + newCounter);
	}

}
