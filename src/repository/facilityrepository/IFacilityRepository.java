package repository.facilityrepository;

import models.facility.Facility;

public interface IFacilityRepository {
    void list();// trưng bày danh sách

    void add(Facility facility /*có thể thêm enum?*/);

    //bảo trì
    void displayMaintenance();

}
