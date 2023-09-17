package MVC.service.impl;

import MVC.model.Manufacturer;
import MVC.model.Motorcycle;
import MVC.service.IMotorcycleService;


import java.util.ArrayList;
import java.util.Scanner;

public class MotorcycleService implements IMotorcycleService {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Motorcycle> listMotocycle = new ArrayList<>();
    private static ArrayList<Manufacturer> listManufacturer = new ArrayList<>();

    public static void addManufacturer(Manufacturer manufacturer) {
        listManufacturer.add(manufacturer);
    }

    @Override
    public void addMotorcycle() {
        listMotocycle.add(infoMotorcycle());
        System.out.println("Add success!!! ");
    }

    @Override
    public void displayMotorcycle() {
        for (Motorcycle motorcycle : listMotocycle) {
            System.out.println(motorcycle);
        }
    }

    @Override
    public void deleteMotorcycle() {
        System.out.println("Enter license plate ");
        String licensePlate = scanner.nextLine();

        for (int i = 0; i < listMotocycle.size(); i++) {
            if (listMotocycle.get(i).getLicensePlate().equals(licensePlate)) {
                System.out.println("Press Y to confirm: ");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    listMotocycle.remove(i);
                    System.out.println("Delete success!!!");
                }
                break;
            } else {
                System.out.println("Not found vehicle.");
            }
        }
    }


    @Override
    public void searchMotorcycle() {
        System.out.println("Enter license plate:");
        String licensePlate = scanner.nextLine();
        for (int i = 0; i < listMotocycle.size(); i++) {
            if (listMotocycle.get(i).getLicensePlate().equals(licensePlate)) {
                System.out.println(listMotocycle.get(i));
                break;
            }
        }
    }

    @Override
    public void displayManufacturers() {
        System.out.println("List of Manufacturers:");
        for (Manufacturer manufacturer : listManufacturer) {
            System.out.println(manufacturer);
        }
    }

    public Motorcycle infoMotorcycle() {
        System.out.println("Enter license plate:");
        String licensePlate = scanner.nextLine();
        System.out.println("Enter manufacturer code:");
        String manufacturerCode = scanner.nextLine();
        Manufacturer selectedManufacturer = null;
        for (Manufacturer manufacturer : listManufacturer) {
            if (manufacturer.getManufacturerCode().equals(manufacturerCode)) {
                selectedManufacturer = manufacturer;
                break;
            }
        }

        if (selectedManufacturer == null) {
            System.out.println("Manufacturer not found.");
            return null;
        }
        System.out.println("Enter publishing year: :");
        int publishingYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter owner :");
        String owner = scanner.nextLine();
        System.out.println("Enter power :");
        double power = scanner.nextDouble();

        Motorcycle motorcycle = new Motorcycle(licensePlate, selectedManufacturer, publishingYear, owner, power);
        return motorcycle;
    }
}
