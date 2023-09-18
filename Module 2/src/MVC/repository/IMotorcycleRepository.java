package MVC.repository;

import MVC.model.Motorcycle;

import java.util.List;

public interface IMotorcycleRepository {
    void addMotorcycle(Motorcycle motorcycle);

    List<Motorcycle> displayMotorcycle();

    void deleteMotorcycle(Motorcycle motorcycle);
}
