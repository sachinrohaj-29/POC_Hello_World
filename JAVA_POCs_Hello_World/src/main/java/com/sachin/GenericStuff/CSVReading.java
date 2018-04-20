package com.sachin.GenericStuff;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import com.opencsv.CSVReader;

public class CSVReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CSVReader reader = null;
		CSVReader reader1 = null;
		try {
			int max=0;
			reader = new CSVReader(new FileReader("src/main/resources/demo.csv"));
			Iterator<String[]> csvIterator = reader.iterator();			
			while(csvIterator.hasNext()){
				String[] line = (String[])csvIterator.next();				
				for(String word : line){
					if(word.length() > max)
						max = word.length();					
				}				
			}
			
			reader1 = new CSVReader(new FileReader("src/main/resources/demo.csv"));
			Iterator<String[]> csvIterator1 = reader1.iterator();
			System.out.println("+---------------------------------------------------------------------------------+");			
			while(csvIterator1.hasNext()){
				String[] line = (String[])csvIterator1.next();				
				for(String word : line){
					System.out.format("|" + "%" + max + "s" , word);					
				}
				System.out.println();
			}
			
			System.out.println("+---------------------------------------------------------------------------------+");						
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
