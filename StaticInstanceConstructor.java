class test{
    // Static variables
    static int a, b;

    static {
        System.out.println("Inside static block");
        a = 10;
        b = 20;
    }

    static void fun1() {
        System.out.println("Inside static method");
    }


    // instance
    int x, y;

    {
        System.out.println("Inside instance block");
        x = 5;
        y = 15;
    }

    void fun2() {
        System.out.println("Inside instance method");
    }


    // Constructor
    test() {
        System.out.println("Inside constructor");
        x = 100;
        y = 200;
    }
}



public class StaticInstanceConstructor {

    public static void main(String[] args) {

        // Call static method directly
        test.fun1();

        // Create object to trigger instance block + constructor
        test obj = new test();

        // Call instance method
        obj.fun2();
    }
}
