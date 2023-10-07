package luyentap2.repository;

import luyentap2.Utils.FileUtils;
import luyentap2.model.Computer;

import java.util.ArrayList;
import java.util.List;

public class ComputerRepository implements IComputerRepository {
    private static final String PATH = "E:\\CG\\Module 2\\src\\luyentap2\\data\\computer.csv";
    private static final String COMMA = ",";

    @Override
    public List<Computer> getList() {
        return readFile();
    }

    @Override
    public void add(Computer computer) {
        List<Computer> computers = readFile();
        computers.add(computer);
        writeFile(computers);
    }

    @Override
    public void delete(String code) {
        List<Computer> computers = readFile();
        for (Computer computer : computers) {
            if (computer.getCode().equals(code)){
                computers.remove(computer);
            }
        }
        writeFile(computers);
    }

    @Override
    public void edit(Computer computer) {
        List<Computer> computers = readFile();
        for (Computer computer1 : computers) {
            if (computer1.getCode().equals(computer.getCode())){
                computer1.setName(computer.getName());
                computer1.setSize(computer.getSize());
                computer1.setType(computer.getType());
                computer1.setPrice(computer.getPrice());
            }
        }
        writeFile(computers);
    }

    @Override
    public List<Computer> searchByName(String name) {
        List<Computer> computers = readFile();
        List<Computer> computerList = new ArrayList<>();
        for (Computer computer : computers) {
            if (computer.getName().contains(name)){
                computerList.add(computer);
            }
        }
        return computerList;
    }

    @Override
    public List<Computer> searchByCode(String code) {
        List<Computer> computers = readFile();
        List<Computer> computerList = new ArrayList<>();
        for (Computer computer : computers) {
            if (computer.getCode().equals(code)){
                computerList.add(computer);
            }
        }
        return computerList;
    }

    public List<String> convertToString(List<Computer> computers) {
        List<String> strings = new ArrayList<>();
        for (Computer computer : computers) {
            strings.add(computer.getCode()
                    + COMMA + computer.getName()
                    + COMMA + computer.getSize()
                    + COMMA + computer.getType()
                    + COMMA + computer.getPrice());
        }
        return strings;
    }

    public List<Computer> convertToObject(List<String> strings) {
        List<Computer> computers = new ArrayList<>();
        for (String string : strings) {
            String[] str = string.split(COMMA);
            computers.add(new Computer(str[0], str[1], str[2], str[3], Integer.parseInt(str[4])));
        }
        return computers;
    }

    public List<Computer> readFile() {
        List<String> strings = FileUtils.readFile(PATH);
        return convertToObject(strings);
    }

    public void writeFile(List<Computer> computers) {
        List<String> strings = convertToString(computers);
        FileUtils.writeFile(PATH, strings);
    }
}
