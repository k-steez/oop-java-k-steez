package Vehicles;

public class RentalTransaction {
    public static void main(String[] args) {

        Truck truck = new Truck("T002", "GravelCrusher", 150.0, true);
        Car car = new Car("C002", "Kia Morning", 50.0, true);
        Motorcycle motorcycle = new Motorcycle("M002", "BronzeControl", 75.0, true);

        System.out.println(car);

        Customer customer = new Customer("Alessia Russo", "Female", "10 days", "Seasonal");
        System.out.println(car.rent(customer, 10));

        System.out.println("Amount to be paid is:" + car.AmountToBePaid(10));


        // Activate special features
        Car.activateSuspension();

    }

    }

