package Vehicles;

public class RentalAgency {
    public static void main(String[] args) {

        Truck truck = new Truck("T001", "Off road truck", 150.0, true);
        Car car = new Car("C001", "Toyota Corolla", 50.0, true);
        Motorcycle motorcycle = new Motorcycle("M001", "WineControl", 75.0, true);

        // Display vehicle details
        System.out.println(truck);
        System.out.println(car);
        System.out.println(motorcycle);

        // Simulate renting a vehicle
        Customer customer = new Customer("Kwame Amoah", "Male", "5 days", "Dry");

        // Initially renting the truck
        System.out.println(truck.rent(customer, 5));

        //Check whether truck is available for rental
        System.out.println(truck.rent(customer, 3));


        System.out.println(truck.returnVehicle());

        System.out.println(truck.rent(customer, 2));

        // Activate special features
        Truck.activateShockAbsorbers();
        Car.activateSuspension();
        Motorcycle.displayTyreType("Off-road");
    }
}
