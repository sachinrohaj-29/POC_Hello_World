package com.sachin.algorithms;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArr = new int[10];
		for(int i=1; i<11; i++){
			intArr[i-1]=i;
		}
		
		for(int i : intArr){
			System.out.println(i);
		}
		
		int[] arr = new int[10];
		
		System.arraycopy(intArr, 3, arr, 0, 5);
		
		for(int i : reverse3(intArr)){
			System.out.println(i);
		}	
		
		
		int p=3;
		int q=2;
		System.out.println(p/q);
		
	}
	
	public static int[] reverse3(int[] nums) {
		  int[] arr = new int[nums.length];
		  int j=0;
		  System.out.println(nums.length-1);
		  for(int i=(nums.length-1); i>=0; i--){
		    arr[j]=nums[i];
		    System.out.println(i + " -> " + nums[i]);
		    j++;
		  }
		  return arr; 
		}


}
