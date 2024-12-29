package Vehicles;

public class Customer {
    private final String name;
    private final String gender;
    private String VehicleRentDuration;
    private String VehicleRentType;

    Customer(String name, String gender, String VehicleRentDuration, String VehicleRentType){
        this.name = name;
        this.gender = gender;
        this.VehicleRentDuration = VehicleRentDuration;
        this.VehicleRentType = VehicleRentType;
    }




    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setVehicleRentDuration(String vehicleRentDuration) {
        VehicleRentDuration = vehicleRentDuration;
    }

    public void setVehicleRentType(String vehicleRentType) {
        VehicleRentType = vehicleRentType;
    }
}




