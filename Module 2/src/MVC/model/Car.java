package MVC.model;

public class Car extends Vehicle {
    private int numberOfSeats;
    private String vehicleType;

    public Car() {
    }

    public Car(String licensePlate, Manufacturer manufacturer, int publishingYear, String owner, int numberOfSeats, String vehicleType) {
        super(licensePlate, manufacturer, publishingYear, owner);
        this.numberOfSeats = numberOfSeats;
        this.vehicleType = vehicleType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String toString() {
        return "Car{" + "licensePlate='" + getLicensePlate() + '\'' + ", manufacturer='" + getManufacturer() + '\'' + ", publishingYear=" + getPublishingYear() + ", owner='" + getOwner() + '\'' + ", numberOfSeats=" + numberOfSeats + ", vehicleType='" + vehicleType + '\'' + '}';
    }
}