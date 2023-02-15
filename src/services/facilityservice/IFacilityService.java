package services.facilityservice;

import models.facility.Room;
import models.facility.Villa;

public interface IFacilityService {
    void list();// trưng bày danh sách

//    void add(Facility facility /*có thể thêm enum?*/);

    void add(Villa villa);

    void add(Room room);
    //bảo trì
    void displayMaintenance();
}
