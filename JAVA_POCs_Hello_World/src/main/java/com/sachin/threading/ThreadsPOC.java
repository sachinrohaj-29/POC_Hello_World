package com.sachin.threading;

public class ThreadsPOC {

	public static void main(String args[]){	
		ThreadsBuilder tb1 = new ThreadsBuilder();
		
		Thread tt = new Thread(){			
			public void run(){
				
			}
		};
		
		Thread t1 = new Thread(tb1,"t1");		
		Thread t2 = new Thread(tb1,"t2");
		
		t1.start();
		/*try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//t2.start();
		
		/*for(int i : tb1.getLl()){
			System.out.println("in 1st: " + i);
		}*/
		System.out.println(tb1.getLl().size());
		
		ThreadsBuilder tb2 = new ThreadsBuilder();
		Thread t12 = new Thread(tb2,"t12");
		t12.start();
		
		/*for(int i : tb2.getLl()){
			System.out.println(i);
		}*/
		System.out.println(tb1.getLl().size());
	}
	
	
	
}

