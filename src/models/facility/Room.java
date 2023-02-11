package models.facility;

public class Room extends Facility {
    private String freeServiceIncluded; //dịch vụ miễn phí đi kèm

    public Room() {
    }


    public Room(String serviceName, String usableArea, String rentalCost, String maxNumberOfPeople, String rentalType, String freeServiceIncluded) {
        super(serviceName, usableArea, rentalCost, maxNumberOfPeople, rentalType);
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
        return "Room{" +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                "} " + super.toString();
    }
}
