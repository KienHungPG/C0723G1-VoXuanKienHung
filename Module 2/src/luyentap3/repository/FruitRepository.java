package luyentap3.repository;

import luyentap3.model.Fruit;
import luyentap3.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class FruitRepository implements IRepository {

    public static final String PATH = "E:\\CG\\Module 2\\src\\luyentap3\\data\\fruit.csv";
    public static final String COMMA = ",";

    @Override
    public List<Fruit> getList() {
        return readFile();
    }

    @Override
    public void add(Fruit fruit) {
        List<Fruit> fruits = readFile();
        fruits.add(fruit);
        writeFile(fruits);
    }

    @Override
    public void edit(Fruit fruit) {
        List<Fruit> fruits = readFile();
        for (Fruit fruit1 : fruits) {
            if (fruit1.getCode().equals(fruit.getCode())) {
                fruit1.setName(fruit.getName());
                fruit1.setOrigin(fruit.getOrigin());
                fruit1.setAmount(fruit.getAmount());
                fruit1.setPrice(fruit.getPrice());
            }
        }
        writeFile(fruits);
    }

    @Override
    public void delete(String code) {
        List<Fruit> fruits = readFile();
        for (Fruit fruit : fruits) {
            if (fruit.getCode().equals(code)) ;
            fruits.remove(fruit);
        }
        writeFile(fruits);
    }

    @Override
    public List<Fruit> searchByName(String name) {
        List<Fruit> fruits = readFile();
        List<Fruit> fruitList = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getName().contains(name)) {
                fruitList.add(fruit);
            }
        }
        return fruitList;
    }

    @Override
    public List<Fruit> searchByCode(String code) {
        List<Fruit> fruits = readFile();
        List<Fruit> fruitList = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getCode().equals(code)) {
                fruitList.add(fruit);
            }
        }
        return fruitList;
    }

    public static List<String> convertToString(List<Fruit> fruits) {
        List<String> strings = new ArrayList<>();
        for (Fruit fruit : fruits) {
            strings.add(fruit.getCode()
                    + COMMA + fruit.getName()
                    + COMMA + fruit.getOrigin()
                    + COMMA + fruit.getAmount()
                    + COMMA + fruit.getPrice());
        }
        return strings;
    }

    public static List<Fruit> convertToObject(List<String> strings) {
        List<Fruit> fruits = new ArrayList<>();
        for (String string : strings) {
            String[] str = string.split(COMMA);
            fruits.add(new Fruit(str[0], str[1], str[2], Integer.parseInt(str[3]), Double.parseDouble(str[4])));
        }
        return fruits;
    }

    public List<Fruit> readFile() {
        List<String> strings = FileUtils.readFile(PATH);
        return convertToObject(strings);
    }

    public void writeFile(List<Fruit> fruits) {
        List<String> strings = convertToString(fruits);
        FileUtils.writeFile(PATH, strings);
    }
}
