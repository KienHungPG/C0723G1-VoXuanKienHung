package casestudy.model.facility;

public class Villa extends Facility{
    private String roomStandards;
    private double poolArea;
    private int numberFloor;

    public Villa() {
    }

    public Villa(String serviceCode, String serviceName, double usableArea, int rentalCosts, int maxPeople, String rentalType, String roomStandards, double poolArea, int numberFloor) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maxPeople, rentalType);
        this.roomStandards = roomStandards;
        this.poolArea = poolArea;
        this.numberFloor = numberFloor;
    }

    public Villa(String roomStandards, double poolArea, int numberFloor) {
        this.roomStandards = roomStandards;
        this.poolArea = poolArea;
        this.numberFloor = numberFloor;
    }

    public String getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(String roomStandards) {
        this.roomStandards = roomStandards;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "Id Service = " + getServiceCode() +
                ", Name Service = " + getServiceName() +
                ", Usable Area = " + getUsableArea() +
                ", Rental Costs = " + getRentalCosts() +
                ", MaximumNumber Of People = " + getMaxPeople() +
                ", Rental Type = " + getRentalType() +
                ", Room Standards = " + roomStandards +
                ", Pool Area = " + poolArea +
                ", Number Of Floors = " + getNumberFloor() + "\n";
    }
}
