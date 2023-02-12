package services.facilityservice;

import models.facility.Facility;

public interface IFacilityService {
    void list();// trưng bày danh sách

    void add(Facility facility /*có thể thêm enum?*/);

    //bảo trì
    void displayMaintenance();
}
