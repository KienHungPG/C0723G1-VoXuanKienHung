package FuramaResort.model.infrastructure;

public class House extends Facility {
    private String typeOfRoom;
    private int numberOfFloor;

    public House(){
    }
    public House(String typeOfRoom, int numberOfFloor) {
        this.typeOfRoom = typeOfRoom;
        this.numberOfFloor = numberOfFloor;
    }

    public House(String serviceCode, String serviceName, double usableArea, int rentalCosts, int maxPeople, String rentalType, String typeOfRoom, int numberOfFloor) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maxPeople, rentalType);
        this.typeOfRoom = typeOfRoom;
        this.numberOfFloor = numberOfFloor;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }
}
