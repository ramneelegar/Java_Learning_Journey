
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
