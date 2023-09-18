package MVC.service.impl;

import MVC.model.Manufacturer;
import MVC.repository.ICarRepository;
import MVC.repository.impl.CarRepositoryImpl;
import MVC.service.ICarService;
import MVC.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService implements ICarService {
    private static Scanner scanner = new Scanner(System.in);
    private final static ICarRepository iCarRepository = new CarRepositoryImpl();
    private static ArrayList<Manufacturer> listManufacturer = new ArrayList<>();




    public static void addManufacturer(Manufacturer manufacturer) {
        listManufacturer.add(manufacturer);
    }

    @Override
    public void addCar() {
        iCarRepository.addCar(infoCar());
        System.out.println("Add success!!! ");
    }

    @Override
    public void displayCar() {
        List<Car> listCar = iCarRepository.displayCar();
        for (Car car : listCar) {
            System.out.println(car);
        }
    }

    @Override
    public void deleteCar() {
        System.out.println("Enter license plate: ");
        String licensePlate = scanner.nextLine();
        List<Car> listCar = iCarRepository.displayCar();

        for (int i = 0; i < listCar.size(); i++) {
            if (listCar.get(i).getLicensePlate().equals(licensePlate)) {
                System.out.println("Press Y to confirm: ");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    iCarRepository.deleteCar(listCar.get(i));
                    System.out.println("Delete success!!!");
                }
                break;
            } else {
                System.out.println("Not found vehicle.");
            }
        }
    }

    @Override
    public void searchCar() {
        System.out.println("Enter license plate:");
        String licensePlate = scanner.nextLine();
        List<Car> listCar = iCarRepository.displayCar();
        for (int i = 0; i < listCar.size(); i++) {
            if (listCar.get(i).getLicensePlate().equals(licensePlate)) {
                System.out.println(listCar.get(i));
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


    public Car infoCar() {
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
        System.out.println("Enter publishing year:");
        int publishingYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter owner:");
        String owner = scanner.nextLine();
        System.out.println("Enter the vehicle's seat number:");
        int numberOfSeats = Integer.parseInt(scanner.nextLine());
        System.out.println("1. Tourist car");
        System.out.println("2. Coach");
        String vehicleType = "";
        int choose;
        do {
            System.out.println("Enter the vehicle's type:");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    vehicleType = "Tourist car";
                    break;
                case 2:
                    vehicleType = "Coach";
                    break;
            }
        } while (choose < 1 || choose > 2);
        Car car = new Car(licensePlate, selectedManufacturer, publishingYear, owner, numberOfSeats, vehicleType);
        return car;
    }
}
