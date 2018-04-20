package com.sachin.GenericStuff;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

interface demointer{
	void show();
	//void display();
}

/*class democlass implements demointer{
	public void show(){
		System.out.println("in the democlass, implementation of the demointer interface");
	}
}*/

public class AnonymusClassANDLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//democlass dc = new democlass();		
		//dc.show();
		
		demointer di = new demointer(){
			public void show(){
				System.out.println("in anyonymus class");
			}
		};
		
		demointer dii = () -> System.out.println("in anyonymus class");
		
		di.show();
		
		System.out.println("============================================");
		
		List ll = new ArrayList();
		for(int i=0; i<5; i++){
			ll.add(i);
		}
		
		Consumer cc = j -> System.out.println(j);
		
		ll.stream().forEach(cc);
		
		ll.stream().forEach(j -> System.out.println(j));		
		
		ll.stream().forEach(System.out::println);
		
		int[] arr = new int[10];
		int[] arr1 = {1,2,3,4,5};
		Object[] arrObj = new Object[18];
		arrObj[0] = "sachin";
		arrObj[1] = 2;
		arrObj[2] = true;
		for(Object o : arrObj){
			System.out.println(o);
		}
		
		
		
		String s = "sachin";
		s= "rohaj";
		System.out.println(s);		
		
		StringBuffer sb = new StringBuffer(2);
		sb.append("sa");
		sb.append("ss");
		sb.append("ss");
		
		System.out.println(Math.round(-4.7));
		System.out.println(Math.floor(-4.7));
		System.out.println(Math.ceil(-4.7));
		//System.out.println(Math.min(-4.7));
		
		
	}
}




















