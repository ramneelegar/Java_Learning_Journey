public class E_DuckingEXp{
    public static void main(String[] args) {
        System.out.println("Connection 1 established");
        demo1 d1 = new demo1();
        try {
            d1.fun1();
        } catch (Exception e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        System.out.println("Connection 1 terminated");
    }
}


import java.util.Scanner;
class demo1{
    void fun1() throws Exception{
        System.out.println("Connection 2 established");
        Scanner scan = new Scanner(System.in);
    }
}
