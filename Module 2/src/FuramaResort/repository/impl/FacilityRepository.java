package FuramaResort.repository.impl;

import FuramaResort.model.infrastructure.Facility;
import FuramaResort.repository.IFacilityRepository;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private final Map<Facility, Integer> facilityMap = new LinkedHashMap<>();


    @Override
    public void deleteFacility(Facility facility) {
        facilityMap.remove(facility);
    }

    @Override
    public void add(Facility facility) {
        facilityMap.put(facility, 0);
    }

    @Override
    public List<Facility> getList() {
        return null;
    }
}
