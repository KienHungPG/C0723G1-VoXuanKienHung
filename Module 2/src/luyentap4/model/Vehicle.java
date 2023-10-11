package luyentap4.model;

public class Vehicle {
    private String plate;
    private String name;
    private String type;
    private String manufacturer;
    private String yearManufacturer;
    private String owner;
    private double price;

    public Vehicle() {
    }

    public Vehicle(String plate, String name, String type, String manufacturer, String yearManufacturer, String owner, double price) {
        this.plate = plate;
        this.name = name;
        this.type = type;
        this.manufacturer = manufacturer;
        this.yearManufacturer = yearManufacturer;
        this.owner = owner;
        this.price = price;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getYearManufacturer() {
        return yearManufacturer;
    }

    public void setYearManufacturer(String yearManufacturer) {
        this.yearManufacturer = yearManufacturer;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "plate='" + plate + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearManufacturer='" + yearManufacturer + '\'' +
                ", owner='" + owner + '\'' +
                ", price=" + price +
                '}';
    }
}