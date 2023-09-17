package MVC.controller;

import MVC.model.Manufacturer;
import MVC.service.ICarService;
import MVC.service.impl.CarService;

import java.util.Scanner;

public class CarController<iCarService> {
    private static ICarService iCarService = new CarService();

    public static void menuCar() {

        Manufacturer toyota = new Manufacturer("TOY", "Toyota", "Japan");
        Manufacturer ford = new Manufacturer("FOR", "Ford", "USA");
        CarService.addManufacturer(toyota);
        CarService.addManufacturer(ford);
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1. Add new car ");
            System.out.println("2. Display car ");
            System.out.println("3. Delete car");
            System.out.println("4. Search by license plate");
            System.out.println("5. Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iCarService.addCar();
                    break;
                case 2:
                    iCarService.displayCar();
                    break;
                case 3:
                    iCarService.deleteCar();
                    break;
                case 4:
                    iCarService.searchCar();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }
}
