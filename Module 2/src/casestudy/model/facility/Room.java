package casestudy.model.facility;

public class Room extends Facility {
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String serviceCode, String serviceName, double usableArea, int rentalCosts, int maxPeople, String rentalType, String freeServiceIncluded) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maxPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Id Service = " + getServiceCode() +
                ", Name Service = " + getServiceName() +
                ", Usable Area = " + getUsableArea() +
                ", Rental Costs = " + getRentalCosts() +
                ", MaximumNumber Of People = " + getMaxPeople() +
                ", Rental Type = " + getRentalType() +
                ", Free Service Included = " + getFreeServiceIncluded() + "\n";
    }
}
