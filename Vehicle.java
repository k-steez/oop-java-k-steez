package Vehicles;

public abstract class Vehicle implements Rentable {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    public Vehicle(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        if (vehicleId == null || vehicleId.isEmpty()) {
            throw new IllegalArgumentException("Vehicle ID cannot be null or empty.");
        }
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty.");
        }
        if (baseRentalRate <= 0) {
            throw new IllegalArgumentException("Base rental rate must be greater than zero.");
        }

        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = isAvailable;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Public setters with validation
    public void setVehicleId(String vehicleId) {
        if (vehicleId == null || vehicleId.isEmpty()) {
            throw new IllegalArgumentException("Vehicle ID cannot be null or empty.");
        }
        this.vehicleId = vehicleId;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty.");
        }
        this.model = model;
    }

    public void setBaseRentalRate(double baseRentalRate) {
        if (baseRentalRate <= 0) {
            throw new IllegalArgumentException("Base rental rate must be greater than zero.");
        }
        this.baseRentalRate = baseRentalRate;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Abstract methods for subclasses to implement
    public abstract double calculateRentalCost(int days);

    public abstract boolean isAvailableForRental();

    // Overriding toString for better object representation
    @Override
    public String toString() {
        return "Vehicle [vehicleId=" + vehicleId + ", model=" + model + ", baseRentalRate=" + baseRentalRate + ", isAvailable=" + isAvailable + "]";
    }


    double AmountToBePaid(int days){
        return getBaseRentalRate() * days;

    }
}
