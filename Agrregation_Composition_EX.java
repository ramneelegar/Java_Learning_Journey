class Bike {
    private String brand;
    private int mileage;

    public Bike(String brand, int mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public int getMileage() {
        return mileage;
    }
}

class Human {

    Heart h = new Heart(300, 120); // composition
    
    void hasA(Bike b) {
        System.out.println(b.getBrand());
        System.out.println(b.getMileage());
    }

}


public class Agrregation_Composition_EX {
    public static void main(String[] args) {
        Human hu = new Human();
        Bike b = new Bike("ram", 40);

        System.out.println(hu.h.getWeight());
        System.out.println(hu.h.getBp());

        hu.hasA(b);

        // if human dies
        hu = null;
        // here we get null pointer exception
        // composition
        // System.out.println(hu.h.getWeight());

        // aggregation
        System.out.println(b.getBrand());
    }
}
