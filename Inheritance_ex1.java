class Test1 {
    int x, y;

    Test1() {
        x = 100;
        y = 200;
    }

    Test1(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Test2 extends Test1 {
    int a, b;

    Test2() {
        super();
        a = 300;
        b = 400;
    }

    Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void disp() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }
}

public class Inheritance_ex1 {
    public static void main(String[] args) {
        Test2 t2 = new Test2();
        t2.disp();


        // we pasing the parametrts still go to 
        // test1 zero parameter constructor
        System.out.println();
        Test2 t = new Test2(9,99);
        t.disp();
    }
}
