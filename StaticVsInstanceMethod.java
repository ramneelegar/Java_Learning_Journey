
// why to declare a method as static

class Car {
    // m --> km remain same so we declare as ststic 
    static int milesToKm(int miles) {
        return (int)(miles * 1.60934); 
    }

    // mileage varies from car to car so instance
    int calcMileage(int distanceKm, int fuelLiters) {
        return distanceKm / fuelLiters;  // calculate mileage in km/liter
    }
}

public class StaticVsInstanceMethod{

    public static void main(String[] args) {

        int km = Car.milesToKm(50);
        System.out.println("50 miles = " + km + " km");

        Car maruthi = new Car();
        int maruthiMileage = maruthi.calcMileage(500, 25);
        System.out.println("Maruthi mileage = " + maruthiMileage );

        Car bmw = new Car();
        int bmwMileage = bmw.calcMileage(600, 40);
        System.out.println("BMW mileage = " + bmwMileage );
    }
}
