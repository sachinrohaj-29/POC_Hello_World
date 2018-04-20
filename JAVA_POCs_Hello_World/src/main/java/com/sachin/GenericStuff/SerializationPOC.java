package com.sachin.GenericStuff;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationPOC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonSingleton pps = PersonSingleton.getInstance();
		try {
			System.out.println(pps.hashCode());
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("f.txt"));
			oos.writeObject(pps);
			
			System.out.println("serialized..........");
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("f.txt"));
			PersonSingleton pers1 = (PersonSingleton)ois.readObject();
			System.out.println(pers1.hashCode());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
