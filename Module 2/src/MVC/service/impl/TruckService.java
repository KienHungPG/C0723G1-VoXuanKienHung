package MVC.service.impl;

import MVC.model.Manufacturer;
import MVC.model.Truck;
import MVC.service.ITruckService;

import java.util.ArrayList;
import java.util.Scanner;

public class TruckService implements ITruckService {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Truck> listTruck = new ArrayList<Truck>();
    private static ArrayList<Manufacturer> listManufacturer = new ArrayList<>();

    public static void addManufacturer(Manufacturer manufacturer) {
        listManufacturer.add(manufacturer);
    }

    @Override
    public void addTruck() {
        listTruck.add(infoTruck());
        System.out.println("Add success!!!");
    }

    @Override
    public void displayTruck() {
        for (Truck truck : listTruck) {
            System.out.println(truck);
        }
    }

    @Override
    public void deleteTruck() {
        System.out.println("Enter license plate ");
        String licensePlate = scanner.nextLine();

        for (int i = 0; i < listTruck.size(); i++) {
            if (listTruck.get(i).getLicensePlate().equals(licensePlate)) {
                System.out.println("Press Y to confirm: ");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    listTruck.remove(i);
                    System.out.println("Delete success!!!");
                }
                break;
            } else {
                System.out.println("Not found vehicle.");
            }
        }
    }

    @Override
    public void searchTruck() {
        System.out.println("Enter license plate:");
        String licensePlate = scanner.nextLine();
        for (int i = 0; i < listTruck.size(); i++) {
            if (listTruck.get(i).getLicensePlate().equals(licensePlate)) {
                System.out.println(listTruck.get(i));
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

    public Truck infoTruck() {
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
        System.out.println("Enter the vehicle's tonnage :");
        double tonnage = scanner.nextDouble();

        Truck truck = new Truck(licensePlate, selectedManufacturer, publishingYear, owner, tonnage);
        return truck;
    }
}