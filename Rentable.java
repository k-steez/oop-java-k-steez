package Vehicles;

public interface Rentable {

    public String rent(Customer customer, int days);

    public String returnVehicle();
}
