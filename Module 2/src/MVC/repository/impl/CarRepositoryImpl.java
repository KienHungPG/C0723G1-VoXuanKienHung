package MVC.repository.impl;

import MVC.model.Car;
import MVC.repository.ICarRepository;

import java.util.ArrayList;
import java.util.List;

public class CarRepositoryImpl implements ICarRepository {
    private final ArrayList<Car> listCar = new ArrayList<>();




    @Override
    public void addCar(Car car) {
        listCar.add(car);
    }

    @Override
    public List<Car> displayCar() {
       return listCar;
    }

    @Override
    public void deleteCar(Car car) {
        listCar.remove(car);
        }





}
