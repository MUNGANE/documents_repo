package java8.features;

public class PracticeLambdaExp {
	 interface FuncInter1 {
	        int operation(int a, int b);
	    }
	 
	 interface FuncInter2 {
		 void massege(String m);
	 }
	 
	 private int operator(int a, int b,FuncInter1 fobj) {
		 return fobj.operation(a, b);
	 }

	public static void main(String[] args) {
		
		FuncInter1 add = (a,b)->  a+b ;
		
		FuncInter1 multiply =(int a,int b)-> a*b;
		
		PracticeLambdaExp e = new PracticeLambdaExp();
		System.out.println(e.operator(6, 7, add));
		System.out.println(e.operator(6, 7, multiply));
		
		FuncInter2 mess = ( m )-> System.out.println(m);
		
		mess.massege("Hello Nikita");
		
		
		

	}

}
