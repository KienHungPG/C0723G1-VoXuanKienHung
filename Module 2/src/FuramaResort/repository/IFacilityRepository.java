package FuramaResort.repository;

import FuramaResort.model.infrastructure.Facility;

import java.util.List;

public interface IFacilityRepository extends IFuramaRepository<Facility>{
    void deleteFacility(Facility facility);
}
