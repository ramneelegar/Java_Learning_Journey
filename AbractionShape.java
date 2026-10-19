
import java.util.Scanner;

// Abstract base class
abstract class Shape {
    double area;

    abstract void acceptInput();
    abstract void calcArea();

    void dispArea() {
        System.out.println("Area: " + area);
    }
}

// Square class
class Square extends Shape {
    double side;

    @Override
    void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("side  ");
        side = sc.nextDouble();
    }

    @Override
    void calcArea() {
        area = side * side;
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, breadth;

    @Override
    void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("length ");
        length = sc.nextDouble();
        System.out.print("breadth ");
        breadth = sc.nextDouble();
    }

    @Override
    void calcArea() {
        area = length * breadth;
    }
}

// Circle class
class Circle extends Shape {
    double radius;

    @Override
    void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("radius ");
        radius = sc.nextDouble();
    }

    @Override
    void calcArea() {
        area = Math.PI * radius * radius;
    }
}

// to achive polymorphism 
class permit {
    static void area(Shape s) {
        s.acceptInput();
        s.calcArea();
        s.dispArea();
    }
}

// Driver class
public class AbractionShape {
    public static void main(String[] args) {
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        
        permit.area(s);
        permit.area(r); 
        permit.area(c);
    }
}
