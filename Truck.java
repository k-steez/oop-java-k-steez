package Vehicles;

public class Truck extends Vehicle {


    public Truck(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        super(vehicleId, model, baseRentalRate, isAvailable);
    }


    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    // Special feature for the truck
    public static void activateShockAbsorbers() {
        System.out.println("Shock absorbers activated!");
    }

    @Override
    public String rent(Customer customer, int days) {
        if (!isAvailableForRental()) {
            return "Truck is not available for rental.";
        }
        setAvailable(false);
        return customer.getName() + " has rented this truck for " + days + " days.";
    }

    @Override
    public String returnVehicle() {
        setAvailable(true);
        return "Truck has been returned.";
    }


    @Override
    public String toString() {
        return "Truck [vehicleId=" + getVehicleId() + ", model=" + getModel() + ", baseRentalRate=" + getBaseRentalRate() + ", isAvailable=" + isAvailable() + "]";
    }
}
