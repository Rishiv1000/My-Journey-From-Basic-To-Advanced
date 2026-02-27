package Java8;

@FunctionalInterface
public interface code06_functional_interface2 {
    default void fun1(){
        System.out.println("this is function interface default method");
    }
     void fun2();
    
}

class A implements code06_functional_interface2{
     @Override
    public void fun2(){
             System.out.print("this is the overridden method of the f. i.");
      }
    public static void main(String[] args) {
       A ob= new A();
       ob.fun1();
       ob.fun2();
    }

    
}