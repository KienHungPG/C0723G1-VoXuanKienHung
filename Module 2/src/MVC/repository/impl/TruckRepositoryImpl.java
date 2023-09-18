package MVC.repository.impl;

import MVC.model.Car;
import MVC.model.Truck;
import MVC.repository.ITruckRepository;

import java.util.ArrayList;
import java.util.List;

public class TruckRepositoryImpl implements ITruckRepository {
    private final ArrayList<Truck> listTruck = new ArrayList<>();

    @Override
    public void addTruck(Truck truck) {
        listTruck.add(truck);
    }

    @Override
    public List<Truck> displayTruck() {
        return listTruck;
    }

    @Override
    public void deleteTruck(Truck truck) {
        listTruck.remove(truck);
    }
}
