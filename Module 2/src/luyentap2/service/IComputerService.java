package luyentap2.service;

import luyentap2.model.Computer;

import java.util.List;

public interface IComputerService {
    List<Computer> getList();
    void add(Computer computer);
    void delete(String code);
    void edit(Computer computer);
    List<Computer> searchByName(String name);
    List<Computer> searchByCode(String code);
}
