package luyentap4.service;

import luyentap4.model.Vehicle;

import java.util.List;

public interface IService {
    List<Vehicle> getList();
    void add(Vehicle vehicle);
    void delete(String plate);
    List<Vehicle> searchByName();
    List<Vehicle> searchByPlate();
    void edit(Vehicle vehicle);
}
