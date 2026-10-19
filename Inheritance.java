class Demo1{
    int a = 10;
}   

class Demo2 extends Demo1{
    void display(){
        System.out.println(a);
    }
}

public class Inheritance{
    public static void main(String[] args)
    {
        Demo2 d2 = new Demo2();
        d2.display();
    }
}
