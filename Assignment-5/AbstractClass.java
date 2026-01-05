abstract class Vehicle {

    abstract double calculateMileage();

    void startEngine() {
        System.out.println("Engine started...");
    }
}

class Car extends Vehicle {

    double fuelUsed;
    double distance;

    Car(double distance, double fuelUsed) {
        this.distance = distance;
        this.fuelUsed = fuelUsed;
    }

    double calculateMileage() {
        return distance / fuelUsed;
    }
}

class Bike extends Vehicle {

    double fuelUsed;
    double distance;

    Bike(double distance, double fuelUsed) {
        this.distance = distance;
        this.fuelUsed = fuelUsed;
    }

    double calculateMileage() {
        return distance / fuelUsed;
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Vehicle c1 = new Car(500, 25);
        Vehicle b1 = new Bike(300, 10);
        c1.startEngine();
        System.out.println("Car mileage: " + c1.calculateMileage());
        b1.startEngine();
        System.out.println("Bike mileage: " + b1.calculateMileage());
    }
}
