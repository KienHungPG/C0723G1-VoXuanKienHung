package MVC.model;

public class Motorcycle extends Vehicle {
    private double power;

    public Motorcycle() {
    }

    public Motorcycle(String licensePlate, Manufacturer manufacturer, int publishingYear, String owner, double power) {
        super(licensePlate, manufacturer, publishingYear, owner);
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                super.toString() +
                "Power='" + power + '\'' +
                '}';
    }
}
