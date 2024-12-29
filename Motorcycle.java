package Vehicles;

public class Motorcycle extends Vehicle {


    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
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

    // Special feature for the motorcycle
    public static void displayTyreType(String type) {
        System.out.println("Tyre type: " + type);
    }


    @Override
    public String rent(Customer customer, int days) {
        if (!isAvailableForRental()) {
            return "Motorcycle is not available for rental.";
        }
        setAvailable(false);
        return customer.getName() + " has rented this motorcycle for " + days + " days.";
    }


    @Override
    public String returnVehicle() {
        setAvailable(true);
        return "Motorcycle has been returned.";
    }


    @Override
    public String toString() {
        return "Motorcycle [vehicleId=" + getVehicleId() + ", model=" + getModel() + ", baseRentalRate=" + getBaseRentalRate() + ", isAvailable=" + isAvailable() + "]";
    }
}

