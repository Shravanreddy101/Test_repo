

class Hello_Test{

    public void test_method(String name){
        System.out.println("Hello " + name);
    }
}


public class Main{
    public static void main(String[] args) {
        Hello_Test test = new Hello_Test();
        test.test_method("Shravan");
        System.out.println("Hey man !");
    }
}