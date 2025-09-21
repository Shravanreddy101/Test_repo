

class Hello_Test{

    String name;

    public Hello_Test(String name){
        this.name = name;
    }

    public void test_method(){
        System.out.println("Hello " + name);
    }
}


public class Main{
    public static void main(String[] args) {
        Hello_Test test = new Hello_Test("Shravan");
        test.test_method();
        
    }
}