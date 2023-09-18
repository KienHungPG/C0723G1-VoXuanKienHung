package MVC.repository.impl;

import MVC.model.Car;
import MVC.model.Motorcycle;
import MVC.repository.IMotorcycleRepository;

import java.util.ArrayList;
import java.util.List;

public class MotorcycleRepositoryImpl implements IMotorcycleRepository {
    private final ArrayList<Motorcycle> listMotorcycle = new ArrayList<>();


    @Override
    public void addMotorcycle(Motorcycle motorcycle) {
        listMotorcycle.add(motorcycle);
    }

    @Override
    public List<Motorcycle> displayMotorcycle() {
        return listMotorcycle;
    }

    @Override
    public void deleteMotorcycle(Motorcycle motorcycle) {
        listMotorcycle.remove(motorcycle);
    }
}
