package com.multithreading;

public class ThreadNew extends Thread 
{
	public void run() {
	for(int j=10;j>=0;j--) {
		System.out.println("value of j is "+j);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
}
