package services.facilityservice;

import models.facility.Room;
import models.facility.Villa;
import repository.facilityrepository.FacilityRepository;

public class FacilityService implements IFacilityService {

    FacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void list() {
        facilityRepository.list();
    }

//    @Override
//    public void add(Facility facility) {
//        facilityRepository.add(facility);
//    }

    @Override
    public void add(Villa villa) {
        facilityRepository.add(villa);
    }

    @Override
    public void add(Room room) {
facilityRepository.add(room);
    }


    @Override
    public void displayMaintenance() {
        facilityRepository.displayMaintenance();
    }
}
