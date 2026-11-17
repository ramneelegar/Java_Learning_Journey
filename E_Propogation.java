public class E_Propogation {
    public static void main(String[] args) {
        System.out.println("Connection 1 established");
        Demo3 d3 = new Demo3();

        d3.fun3();
        System.out.println("Connection 1 terminated");
    }
}

class Demo3 {
    void fun3() {
        System.out.println("Connection 2 established");
        Demo2 d2 = new Demo2();
        d2.fun2();
        System.out.println("Connection 2 terminated");
    }
}

class Demo2 {
    void fun2() {
        System.out.println("Connection 3 established");
        Demo1 d1 = new Demo1();
        d1.fun1();
        System.out.println("Connection 3 terminated");
    }
}
