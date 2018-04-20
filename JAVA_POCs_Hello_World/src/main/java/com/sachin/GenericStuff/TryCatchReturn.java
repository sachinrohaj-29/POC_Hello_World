package com.sachin.GenericStuff;

public class TryCatchReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		System.out.println(run(i));
	}

	public static int run(int i){
		try{
			i=1;
			throw new Exception();
			//return i;
		}
		catch(Exception e){
			i=2;
			return i;
		}
		finally{
			i=3;
			return i;
		}
	}
}
