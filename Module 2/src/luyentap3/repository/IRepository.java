package luyentap3.repository;

import luyentap3.model.Fruit;

import java.util.List;

public interface IRepository {
    List<Fruit> getList();
    void add(Fruit fruit);
    void edit(Fruit fruit);
    void delete(String code);
    List<Fruit> searchByName(String name);
    List<Fruit> searchByCode(String code);
}
