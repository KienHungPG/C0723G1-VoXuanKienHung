package MVC.repository;

import MVC.model.Car;

import java.util.List;

public interface ICarRepository {
    void addCar(Car car);

    List<Car> displayCar();

    void deleteCar(Car car);


}
