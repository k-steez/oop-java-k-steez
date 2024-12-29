package Vehicles;

public class Car extends Vehicle {
    public Car(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
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

    // Special feature for the car
    public static void activateSuspension() {
        System.out.println("Suspension activated!");
    }


    @Override
    public String rent(Customer customer, int days) {
        if (!isAvailableForRental()) {
            return "Car is not available for rental.";
        }
        setAvailable(false);
        return customer.getName() + " has rented this car for " + days + " days.";
    }

    @Override
    public String returnVehicle() {
        setAvailable(true);
        return "Car has been returned.";
    }


    @Override
    public String toString() {
        return "Car [vehicleId=" + getVehicleId() + ", model=" + getModel() + ", baseRentalRate=" + getBaseRentalRate() + ", isAvailable=" + isAvailable() + "]";
    }
}
