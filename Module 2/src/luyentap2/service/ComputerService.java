package luyentap2.service;

import luyentap2.model.Computer;
import luyentap2.repository.ComputerRepository;
import luyentap2.repository.IComputerRepository;

import java.util.List;

public class ComputerService implements IComputerService{
    private final IComputerRepository computerRepository = new ComputerRepository();
    @Override
    public List<Computer> getList() {
        return computerRepository.getList();
    }

    @Override
    public void add(Computer computer) {
        computerRepository.add(computer);
    }

    @Override
    public void delete(String code) {
        computerRepository.delete(code);
    }

    @Override
    public void edit(Computer computer) {
        computerRepository.edit(computer);
    }

    @Override
    public List<Computer> searchByName(String name) {
        return computerRepository.searchByName(name);
    }

    @Override
    public List<Computer> searchByCode(String code) {
        return computerRepository.searchByCode(code);
    }
}
