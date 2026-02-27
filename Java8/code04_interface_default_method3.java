package Java8;

// default keyword: -> this Keyword is not use for access modifier
// -> Using default keyword we can create complete methods inside interface. This was introduced in java version 8 

public interface code04_interface_default_method3 {
	default public void test1() {
		System.out.println("From test1");
	}
}

// public class B implements Example4 {
// 	public static void main(String[] args) {
// 		B b1 = new B();
// 		b1.test1();
// 	}		
// }