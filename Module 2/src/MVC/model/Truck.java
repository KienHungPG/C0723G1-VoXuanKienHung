package MVC.model;

public class Truck extends Vehicle {
    private double tonnage;

    public Truck() {
    }

    public Truck(String licensePlate, Manufacturer manufacturer, int publishingYear, String owner, double tonnage) {
        super(licensePlate, manufacturer, publishingYear, owner);
        this.tonnage = tonnage;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" +
                super.toString() +
                "Tonnage='" + tonnage + '\'' +
                '}';
    }
}
