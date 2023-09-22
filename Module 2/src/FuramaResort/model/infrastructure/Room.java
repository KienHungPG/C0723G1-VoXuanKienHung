package FuramaResort.model.infrastructure;

public class Room extends Facility {
    private String serviceIncluded;

    public Room(){
    }
    public Room(String serviceIncluded) {
        this.serviceIncluded = serviceIncluded;
    }

    public Room(String serviceCode, String serviceName, double usableArea, int rentalCosts, int maxPeople, String rentalType, String serviceIncluded) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maxPeople, rentalType);
        this.serviceIncluded = serviceIncluded;
    }

    public String getServiceIncluded() {
        return serviceIncluded;
    }

    public void setServiceIncluded(String serviceIncluded) {
        this.serviceIncluded = serviceIncluded;
    }
}
