package MVC.model;

public abstract class Vehicle {
    private String licensePlate;
    private Manufacturer manufacturer;
    private int publishingYear;
    private String owner;

    public Vehicle() {
    }

    public Vehicle(String licensePlate, Manufacturer manufacturer, int publishingYear, String owner) {
        this.licensePlate = licensePlate;
        this.manufacturer = manufacturer;
        this.publishingYear = publishingYear;
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "licensePlate='" + licensePlate + '\'' + ", manufacturer='" + manufacturer + '\'' + ", publishingYear=" + publishingYear + ", owner='" + owner + '\'' + '}';
    }
}
