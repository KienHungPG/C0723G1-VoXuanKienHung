package FuramaResort.model.infrastructure;

public class Villa extends House {
    private double poolArea;

    public Villa(){
    }
    public Villa(double poolArea) {
        this.poolArea = poolArea;
    }

    public Villa(String typeOfRoom, int numberOfFloor, double poolArea) {
        super(typeOfRoom, numberOfFloor);
        this.poolArea = poolArea;
    }

    public Villa(String serviceCode, String serviceName, double usableArea, int rentalCosts, int maxPeople, String rentalType, String typeOfRoom, int numberOfFloor, double poolArea) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maxPeople, rentalType, typeOfRoom, numberOfFloor);
        this.poolArea = poolArea;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }
}
