//this example is to understand ambiguty problem
package com.springcore.CI;

public class Addition {
	
	private int a;
	private int b;
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		
		this.b = (int)b;
		System.out.println("Constructore: double,double");
	}
	public Addition(int a, int b) {
		super();
		this.a = a;
		System.out.println("value of a is: "+this.a);
		this.b = b;
		System.out.println("value of b is: "+this.b);
		System.out.println("Constructore: int,int");
	}
	
	public int Sum() {
		System.out.println("sum is:" + (this.a + this.b));
		return this.a+this.b;
		
	}

}
