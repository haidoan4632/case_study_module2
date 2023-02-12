package services.facilityservice;

import models.facility.Facility;
import repository.facilityrepository.FacilityRepository;

public class FacilityService implements IFacilityService {

    FacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void list() {
        facilityRepository.list();
    }

    @Override
    public void add(Facility facility) {
        facilityRepository.add(facility);
    }

    @Override
    public void displayMaintenance() {
        facilityRepository.displayMaintenance();
    }
}
