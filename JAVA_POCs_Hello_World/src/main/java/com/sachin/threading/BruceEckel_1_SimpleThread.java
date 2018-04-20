package com.sachin.threading;


/*public class BruceEckel_1_SimpleThread extends Thread {	   
	  private int countDown = 5; 
	  private static int threadCount = 0; 
	  
	  public BruceEckel_1_SimpleThread() { 
	    super("" + ++threadCount); // Store the thread name
	    start(); 
	    try {
			join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	    
	  } 
	  
	  public String toString() { 
	    return "#" + getName() + ": " + countDown; 
	  } 
	  
	  public void run(){
		  synchronized(this){
			  while(true) {			
				  //System.out.println("In Thread: " + this);
				  try {
					this.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					throw new RuntimeException(e);					
				}				
			      System.out.println(this); 
			      if(--countDown == 0) return; 
			    }
		  }			  
	  } 
	  
	  public static void main(String[] args) throws InterruptedException{ 
	    for(int i = 0; i < 5; i++) 
	      new BruceEckel_1_SimpleThread();
	}
}*/


class BruceEckel_1_SimpleThread {
	  private int i; 
	  public void next() { i++; i++; } 
	  public int getValue() { return i; } 
	  public static void main(String args[]) { 
	    final BruceEckel_1_SimpleThread ae = new BruceEckel_1_SimpleThread(); 
	    new Thread("Watcher") { 
	      public void run() { 
	        while(true) { 
	          int val = ae.getValue(); 
	          if(val % 2 != 0) { 
	            System.out.println(val); 
	            //System.exit(0); 
	          } 
	        } 
	      } 
	    }.start(); 
	    while(true) 
	      ae.next(); 
	  } 
}