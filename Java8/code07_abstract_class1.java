package Java8;

//Abstract Class

 // In an abstract class we can create both static / non static members
// We cannot create static incomplete methods here but we can create complete static methods 

abstract public class code07_abstract_class1 {
	public void test1() {
		
	}
    public static void test3() {
		
	}

	abstract public void test2(); // this is abstract Class...........
	
	// public static void test4(); ......//Error

	public static void main(String[] args) {
		// code07_abstract_class1 a1 = new code07_abstract_class1();...........//Error because of we can not create object of abstract class
	}
}


