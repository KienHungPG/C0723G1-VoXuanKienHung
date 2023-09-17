package MVC.controller;

import MVC.model.Manufacturer;
import MVC.service.IMotorcycleService;
import MVC.service.impl.MotorcycleService;

import java.util.Scanner;

public class MotocycleController {
    private static IMotorcycleService iMotorcycleService = new MotorcycleService();

    public static void menuMotorcycle() {
        Manufacturer honda = new Manufacturer("HON", "Honda", "Japan");
        Manufacturer yamaha = new Manufacturer("YAM", "Yamaha", "Japan");
        MotorcycleService.addManufacturer(honda);
        MotorcycleService.addManufacturer(yamaha);
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1. Add new motocycle ");
            System.out.println("2. Display motocycle ");
            System.out.println("3. Delete motocycle");
            System.out.println("4. Search by license plate");
            System.out.println("5. Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iMotorcycleService.addMotorcycle();
                    break;
                case 2:
                    iMotorcycleService.displayMotorcycle();
                    break;
                case 3:
                    iMotorcycleService.deleteMotorcycle();
                    break;
                case 4:
                    iMotorcycleService.searchMotorcycle();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }
}
