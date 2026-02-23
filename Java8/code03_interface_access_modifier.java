package Java8;

// Note: In an interface a method can only be public/default, it cannot be private/protected
 
public interface code03_interface_access_modifier {

	// protected void test1();//----->Error, 
	// private void test2();//--->Error
	void test3();//----->No Error, Ye Default Method Hai
	public void test4();//--->No Error

}
