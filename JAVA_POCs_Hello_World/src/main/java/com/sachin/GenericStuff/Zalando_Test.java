package com.sachin.GenericStuff;

public class Zalando_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 1234567;
		// 162534
		// 1234567 -> 1726354
		String AA = Integer.toString(A);
		int midAA = AA.length()%2;
		StringBuffer aa = new StringBuffer();
		int start = 0;
		int end = AA.length()-1;
		
		for(int i=0; i<AA.length()/2; i++){			
			//System.out.println(AA.charAt(i));			
				aa.append(AA.charAt(start));
				aa.append(AA.charAt(end));
				start++;
				end--;
			}			
		
		
		if(midAA == 1){
			aa.append(AA.charAt(AA.length()/2));
		}		
		
		int abc = Integer.parseInt(aa.toString());
		System.out.println(aa);
	}

}
