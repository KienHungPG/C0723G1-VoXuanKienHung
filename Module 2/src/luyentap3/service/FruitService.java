package luyentap3.service;

import luyentap3.model.Fruit;
import luyentap3.repository.FruitRepository;
import luyentap3.repository.IRepository;

import java.util.List;

public class FruitService implements IService {
    private final IRepository repository = new FruitRepository();

    @Override
    public List<Fruit> getList() {
        return repository.getList();
    }

    @Override
    public void add(Fruit fruit) {
        repository.add(fruit);
    }

    @Override
    public void edit(Fruit fruit) {
        repository.edit(fruit);
    }

    @Override
    public void delete(String code) {
        repository.delete(code);
    }

    @Override
    public List<Fruit> searchByName(String name) {
        return repository.searchByName(name);
    }

    @Override
    public List<Fruit> searchByCode(String code) {
         return repository.searchByCode(code);
    }
}
