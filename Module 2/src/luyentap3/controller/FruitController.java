package luyentap3.controller;

import luyentap3.model.Fruit;
import luyentap3.service.FruitService;
import luyentap3.service.IService;

import java.util.List;

public class FruitController {
    private final IService service = new FruitService();

    public List<Fruit> getList(){
        return service.getList();
    }
    public void add(Fruit fruit){
        service.add(fruit);
    }
    public void edit(Fruit fruit){
        service.edit(fruit);
    }
    public void delete(String code){
        service.delete(code);
    }
    public List<Fruit> searchByName(String name){
        return service.searchByName(name);
    }
    public List<Fruit> searchByCode(String code){
        return service.searchByCode(code);
    }
}
