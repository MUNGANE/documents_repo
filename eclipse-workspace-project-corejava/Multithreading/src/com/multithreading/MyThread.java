package com.multithreading;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for(int i =0;i<=10;i++) {
			System.out.println("value of i is "+i);
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		MyThread t = new MyThread();
		Thread myThread = new Thread(t);
		myThread.start();
		
		ThreadNew t2= new ThreadNew();
		t2.start();
		
	    
	}

}
