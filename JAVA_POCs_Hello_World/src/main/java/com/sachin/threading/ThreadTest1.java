package com.sachin.threading;

public class ThreadTest1 extends Thread{

	@Override
    public void run() {
        super.run();
        for(int i=0; i<10; i++)
        {
            System.out.println(i + "   :"+ Thread.currentThread().getName());
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Thread is getting started");
        ThreadTest1 th0= new ThreadTest1();
        th0.start();
        ThreadTest1 th1= new ThreadTest1();
        //th1.start();
        try {
            th1.join(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        th1.start();
	}

}
