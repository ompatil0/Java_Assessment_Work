// 15. A ride booking application supports different types of rides. Each ride calculates
// fare differently.
// Question:
// Create an abstract class Ride with:
//  distance
//  abstract method calculateFare()
// Create subclasses:
//  BikeRide → fare = ₹5 per km
//  AutoRide → fare = ₹8 per km
//  CarRide → fare = ₹12 per km
// Store different rides in a Ride array and calculate fares using runtime
// polymorphism.

abstract class Ride {
    int distance;

    Ride(int d) {
        distance = d;
    }

    abstract double calculateFare();
}

class BikeRide extends Ride {
    BikeRide(int d) {
        super(d);
    }

    double calculateFare() {
        return distance * 5;
    }
}

class AutoRide extends Ride {
    AutoRide(int d) {
        super(d);
    }

    double calculateFare() {
        return distance * 8;
    }
}

class CarRide extends Ride {
    CarRide(int d) {
        super(d);
    }

    double calculateFare() {
        return distance * 12;
    }
}

class RideDemo{
    public static void main(String[] args) {

        Ride r;

        r = new BikeRide(10);
        System.out.println("Bike Fare: " + r.calculateFare());

        r = new AutoRide(10);
        System.out.println("Auto Fare: " + r.calculateFare());

        r = new CarRide(10);
        System.out.println("Car Fare: " + r.calculateFare());
    }
}