// Re-throwing the exception to the main mathod

import java.util.Scanner;
public class E_ReThrowingExp{
    public static void main(String[] args) {
        System.out.println("Connection 1 established");
        demo d1 = new demo();

        try {
            d1.fun1();
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
