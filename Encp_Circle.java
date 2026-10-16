// here we solving according to memory persfective
import java.util.Scanner;

class Circle {
    private float r;
    private static float area;
    private static final float PI = (float)Math.PI; // constant for π

    public void acceptInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        r = scan.nextFloat();
    }

    public void calculateArea() {
        area = PI * r * r;
    }

    public void displayArea() {
        System.out.println("Area of the circle: " + area);
    }
}


public class Encp_Circle{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.acceptInput();
        c.calculateArea();
        c.displayArea();
    }
}
