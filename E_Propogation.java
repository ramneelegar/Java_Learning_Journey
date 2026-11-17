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
