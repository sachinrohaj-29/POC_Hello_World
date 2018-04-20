package com.sachin.GenericStuff;

public class BiggestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,6,9,1,7,23,14};
			
		for(int i : arr){
			System.out.println(i);
		}
		
		int maxNo = arr[0];
		for(int i=0;i<arr.length;i++){
			maxNo = maxNo > arr[i] ? maxNo : arr[i];
		}
		
		System.out.println(maxNo);
	}

}
