public class Basic1 {
    int x = 10; //Non-static Variable/ Instance Variable /Object Variables => belong to object
    static int y=11; //static Varible => belong to class
    public static void main(String[] args){
        Basic1 a1 = new Basic1();
        System.out.println(a1);
        System.out.println(a1.x);
        a1.x=11;
        System.out.println(a1.x);

        System.out.println(Basic1.y);
		Basic1.y = 12;
		System.out.println(Basic1.y); 

        
        
    }
}