package com.springcore.lifecycle;

public class Samosa {
   public Samosa(double price) {
		super();
		this.price = price;
	}

private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	System.out.println("setting prop");
	this.price = price;
}

@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}

public Samosa() {
	super();
	// TODO Auto-generated constructor stub
}
//Spring provide two imp methods init and destroy to every bean automatically
//Life Cycle - >Create object ----assign property-----init()-----read and use obj-----destroy()-------destroy object
// we can use any name in place of init and destroy but signature must be like below only that is public void and no arguments
public void init() {
	//init is use to initialize the code
	//to make any data base connection
	//loading config
	System.out.println("Inside init methode");
	
}
public void destroy() {
	//clean up code we can write
	//close the db connection
	System.out.println("inside destroy methode");
}
}
