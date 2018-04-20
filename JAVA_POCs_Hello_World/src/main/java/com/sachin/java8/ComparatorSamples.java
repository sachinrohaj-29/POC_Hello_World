package com.sachin.java8;

import java.util.Comparator;

public class ComparatorSamples {

	public static Comparator<Songs> titleComp= new Comparator<Songs>(){
		@Override
		public int compare(Songs o1, Songs o2) {
			// TODO Auto-generated method stub
			return o1.getTitle().compareTo(o2.getTitle());
		}		
	};
	
	public static Comparator<Songs> reverseGenereComp = ((s1,s2) -> (-s1.getGenere().compareTo(s2.getGenere())));
	public static Comparator<Songs> genereComp = ((s1,s2) -> (s1.getGenere().compareTo(s2.getGenere())));
	public static Comparator<Songs> durationComp = ((s1,s2) -> (s1.getLength() > s2.getLength() ? 1 : (s1.getLength() < s2.getLength() ? -1 : 0)));	
}
