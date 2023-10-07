package luyentap2.repository;

import luyentap2.model.Computer;

import java.util.List;

public interface IComputerRepository {
    List<Computer> getList();
    void add(Computer computer);
    void delete(String code);
    void edit(Computer computer);
    List<Computer> searchByName(String name);
    List<Computer> searchByCode(String code);
}
