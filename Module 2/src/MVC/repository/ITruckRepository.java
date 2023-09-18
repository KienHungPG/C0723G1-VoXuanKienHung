package MVC.repository;


import MVC.model.Truck;

import java.util.List;

public interface ITruckRepository {
    void addTruck(Truck truck);

    List<Truck> displayTruck();

    void deleteTruck(Truck truck);
}
