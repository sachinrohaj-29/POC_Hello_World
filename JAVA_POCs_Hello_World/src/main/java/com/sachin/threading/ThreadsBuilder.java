package com.sachin.threading;

import java.util.ArrayList;
import java.util.List;

public class ThreadsBuilder implements Runnable{

	List<Integer> ll = new ArrayList<Integer>();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(ll){
			for(int i=0; i<5; i++){
				ll.add(i);
				System.out.println("in thread loop" + Thread.currentThread());
			}			
		}
	}

	public List<Integer> getLl() {
		return ll;
	}

	public void setLl(List<Integer> ll) {
		this.ll = ll;
	}
	
}