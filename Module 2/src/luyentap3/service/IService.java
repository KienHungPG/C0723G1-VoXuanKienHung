package luyentap3.service;

import luyentap3.model.Fruit;

import java.util.List;

public interface IService {
    List<Fruit> getList();
    void add(Fruit fruit);
    void edit(Fruit fruit);
    void delete(String code);
    List<Fruit> searchByName(String name);
    List<Fruit> searchByCode(String code);

}
