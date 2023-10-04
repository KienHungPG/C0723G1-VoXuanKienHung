package casestudy.model.facility;

public class House extends Facility {
    private String roomStandards;
    private int numberFloor;

    public House() {
    }

    public House(String serviceCode, String serviceName, double usableArea, int rentalCosts, int maxPeople, String rentalType, String roomStandards, int numberFloor) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maxPeople, rentalType);
        this.roomStandards = roomStandards;
        this.numberFloor = numberFloor;
    }

    public House(String roomStandards, int numberFloor) {
        this.roomStandards = roomStandards;
        this.numberFloor = numberFloor;
    }

    public String getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(String roomStandards) {
        this.roomStandards = roomStandards;
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
                ", Number Of Floors = " + getNumberFloor() + "\n";
    }
}
