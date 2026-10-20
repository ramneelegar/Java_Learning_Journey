
final class Vehicle {
    void display() {
        System.out.println("This is a vehicle");
    }
}

// Cannot extend a final class
// class Car extends Vehicle {
// }

public class FinalClass {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.display();
    }
}
