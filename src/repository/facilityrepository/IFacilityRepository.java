package repository.facilityrepository;

import models.facility.Room;
import models.facility.Villa;

public interface IFacilityRepository {
    void list();// trưng bày danh sách

//    void add(Facility facility /*có thể thêm enum?*/);

    void add(Villa villa);

    void add(Room room);

    //bảo trì
    void displayMaintenance();

}
