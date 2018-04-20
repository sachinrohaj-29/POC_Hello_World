package com.sachin.GenericStuff;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UBSMain implements Serializable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Map<Flower,String> flowers = new HashMap<Flower,String>();
		flowers.put(new Flower("Rose"), "Rose 212");
		flowers.put(new Flower("SunFlower"), "SunFlower 121");
		Flower f = new Flower("Rose");
		System.out.println(flowers.get(f));*/
		
		/*String s = "123.23456abcd";
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(16);
		try {
			System.out.println(nf.parse(s));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*Double d1 = new Double("2.0");
		Double d2 = new Double("2.00");
		
		BigDecimal bd1 = new BigDecimal("2.0");
		BigDecimal bd2 = new BigDecimal("2.00");
		
		System.out.println(d1.equals(d2) + " " + bd1.equals(bd2));*/
		
		/*String[] abc = {"abc"};
		try{
			process1(abc);
		}
		catch(Exception e){
			System.out.println("Exception--");
			process1(abc);
		}*/
		
		/*C c = new C();
		c.doSome();*/
		
		/*UBSMain um = new UBSMain();
		um.print(null);
		//print(null);
*/	
		/*System.out.println("A");
		synchronized(args){
			System.out.println("B");
			try {
				args.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("C");*/
		
		/*String[] args1 = {"abc","pqr"};
		main(args1[0]);*/
		
		UBSMain um = new UBSMain();
		ObjectOutputStream os;
		try {
			os = new ObjectOutputStream(new FileOutputStream("ff.ser"));
			os.writeObject(um);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String arg){
		System.out.println(arg);
	}
	static void print(Integer i){
		System.out.println("in Integer" + i);
	}
	
	static void print(String s){
		System.out.println("in String" + s);
	}	
	
	static int process1(String[] str){
		return Integer.parseInt(str[0]);
	}
}


interface A{}

class B implements A{
	public void doStuff(){
		System.out.println("do stuff");
	}
}

class C extends B implements A {
	public void doSome(){
		System.out.println("doSome");
	}
}

class Flower{
	String name;
	Flower(String name){
		this.name = name;
	}
}