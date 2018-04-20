package com.sachin.GenericStuff;

import java.io.Serializable;

public class PersonSingleton implements Serializable{

	private static PersonSingleton singleInstance = null;
	
	private PersonSingleton(){}
	
	public static PersonSingleton getInstance(){
		if(null == singleInstance){
			singleInstance = new PersonSingleton();
			return singleInstance;
		}
		else
			return singleInstance;
	}
	
	public Object readResolve(){
		return singleInstance;
	}
}
