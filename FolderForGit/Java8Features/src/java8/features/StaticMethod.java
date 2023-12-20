package java8.features;

//static methode are those methode for which no need to call them usuing object we can directly call them because they are not related to object nor class
interface  Interf{
	public static void m1(){
		System.out.println("static method");
		
	}
}
public class StaticMethod implements Interf{
	public static void main(String[] args) {
		Interf.m1();
		//m1();
		//StaticMethod.m1();
		//StaticMethod s= new StaticMethod();
		//s.m1();
		//above all this stat only first is valid because this static method not available to implimented class only we can call them using interface name
	// if this class would not be the implement of interf then also we can able to call m1 methode because static methode not related to any class or obje.
	// from 1.8 v we can write main methode in interface as well
	}
	

}
