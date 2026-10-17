    
abstract class Plane {
    abstract void takeOff();
    abstract void fly();
    abstract void land();
}


class CargoPlane extends Plane {
    void fly() {
        System.out.println("CargoPlane is flying at lower heights");
    }

    void takeOff() {
        System.out.println("CargoPlane is taking off from a long runway");
    }

    void land() {
        System.out.println("CargoPlane is landing with heavy load");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Plane cp = new CargoPlane(); // polymorphism
        cp.takeOff();
        cp.fly();
        cp.land();
    }
}
