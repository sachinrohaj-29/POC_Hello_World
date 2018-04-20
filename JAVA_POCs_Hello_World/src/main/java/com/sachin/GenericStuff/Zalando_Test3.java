package com.sachin.GenericStuff;

public class Zalando_Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {1,3,5,3,4};
		//Arrays.sort(A);
		boolean flagA = isSorted(A);
		
		if(!flagA){
			int[] B = swap(A);
			for(int i : B){
				System.out.println(i);
			}
			flagA = isSorted(B);
		}
		
		//return flagA;
		System.out.println(flagA);
	}

	private static int[] swap(int[] a) {
		// TODO Auto-generated method stub
		int swapPosition=-1;
		int[] b = new int[a.length];
		for(int i=0; i<a.length; i++){
			if(i+1<a.length && a[i+1] < a[i]){
				System.out.println(a[i]);
				for(int p=i; p<a.length; p++){
					//System.out.println(a[p]+ " " + a[i]);
					if(a[p] > a[i]){
						System.out.println(a[p]+ " " + a[i]);
						swapPosition = p-1;
						b[i] = a[p-1];
						b[p-1] = a[i];
						System.out.println(b[i] + " " + b[p-1]);
					}
				}				
			}		
			else{
				if(i != swapPosition)
					b[i]=a[i];
			}
		}
		return b;
	}

	private static boolean isSorted(int[] a) {
		// TODO Auto-generated method stub
		boolean flag=true;
		for(int i=0; i<a.length; i++){
			if(i+1<a.length && a[i+1] < a[i]){
				flag=false;
				break;
			}			
		}
		return flag;
	}

}
