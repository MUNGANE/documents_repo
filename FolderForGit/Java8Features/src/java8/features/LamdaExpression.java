package java8.features;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.*;

public class LamdaExpression {
	// TODO Auto-generated method stub
			//lamda expression is anonymous 
			//anonymous -> no name,no modifier,no return type 
			
			//normal way
	
	public static int m1(int a) {
		return a*a ;
	}
	
	// lamda exp
	//(int a)-> {return a*a;}
	
    //or  a ->{ return a*a; }//or
    //or  a-> a*a;
	
	
	//to call the lamda exp we need functional interface
	//FI are those which must  contain  only one abstract methode
	//FI can contaion default and static methode
	interface Interf{
		public void add(int a,int b);
	}

	/* this is normal way without lamba exp
	 * class Interf1 implements Interf{ public void add( int a, int b) { System.out.println("the sum :"+ (a+b));
	 * } }
	 */
	public static void main(String[] args) {
		
		System.out.println(m1(3));
		
		Interf i = (a,b) -> System.out.println("the sum :"+ (a+b));
		i.add(10, 20);
		i.add(100, 200);
		
		// lambda expression with multiple threading
		
		Runnable r = () -> {
			for (int j =0;j<2;j++) {
				System.out.println("Child Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for(int j =0;j<2;j++) {
			System.out.println("Main Thread");
		}
		
		//lambda exp with collections
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(10);
		l.add(4);
		l.add(8);
		l.add(25);
		l.add(50);
		System.out.println(l);
		Comparator<Integer> c= (I1,I2)-> (I1<I2)?-1:(I1>I2)?+1:0;
		Collections.sort(l, c);
		System.out.println(l);
		l.stream().forEach(System.out::println);
		List<Integer> l2= l.stream().filter(k->k%2==0).collect(Collectors.toList());
		System.out.println(l2);

	}
	
	
	
	

}
