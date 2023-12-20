package java8.features;

public class DefaultMethode {

	public static void main(String[] args) {
		// until 1.7 v- every methode inside interface is always public and abstract 
		// 1.8 v- dafult _+ static 
		//1.9 v- private
		// variable always public static final in every version
		interface Interf{
			public void m1();
			public void m2();
			//public void m3();
			default void m3() {
				System.out.println("default");
			}
		}
		class Test1 implements Interf{
			
			public void m1() {}
			public void m2() {}
		}
        class Test2 implements Interf{
			
			public void m1() {}
			public void m2() {}

			/*
			 * default void m3() { System.out.println("error"); }
			 */
			public void m3() {
				System.out.println("overide methode");
			}
		}
        // now if you try to add another methode m3() in interface You have to  ovverride that methode
        // in every implemneted class so to resolve this issue u can add dafault methode in interf
		Test2 t = new Test2();
		t.m3();// u can override m3() in test2 class but u have to declare it public not default because default only appli to interface not implement class
	
	    //java does not support multiple inheritance 
		//because if there are two class having same methode then in child class extending both class if we called that methode then it is confusion for compiler like which methde shoud call
		// but we can solve this using default
		
		interface Left{
			default void m1() {
				System.out.println("Left");
			}
			
		}
		interface Right{
			default void m1() {
				System.out.println("Right");
			}
			
		}
		
		class Test3 implements Left,Right{
			public void m1() {
				System.out.println("our own methode");
				//you can call left n right as well
				Left.super.m1();
				Right.super.m1();
				
			}
		}
		
		Test3 t1= new Test3();
		t1.m1();
		
	
	}

}
