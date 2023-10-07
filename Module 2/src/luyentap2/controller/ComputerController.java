package luyentap2.controller;

import luyentap2.model.Computer;
import luyentap2.service.ComputerService;
import luyentap2.service.IComputerService;

import java.util.List;

public class ComputerController {
    private final IComputerService computerService = new ComputerService();
    public List<Computer> getList(){
        return computerService.getList();
    }
    public void add(Computer computer){
        computerService.add(computer);
    }
    public void delete(String code){
        computerService.delete(code);
    }
    public void edit(Computer computer){
        computerService.edit(computer);
    }
    public List<Computer> searchByName(String name){
        return computerService.searchByName(name);
    }
    public List<Computer> searchByCode(String code){
        return computerService.searchByCode(code);
    }
}
