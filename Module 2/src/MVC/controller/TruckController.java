package MVC.controller;

import MVC.model.Manufacturer;
import MVC.service.ITruckService;
import MVC.service.impl.TruckService;

import java.util.Scanner;

public class TruckController {
    private static ITruckService iTruckService = new TruckService();

    public static void menuTruck() {
        Manufacturer volvo = new Manufacturer("VOL", "Volvo", "Sweden");
        Manufacturer scania = new Manufacturer("SCA", "Scania", "Sweden");
        TruckService.addManufacturer(volvo);
        TruckService.addManufacturer(scania);
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1. Add new truck ");
            System.out.println("2. Display truck ");
            System.out.println("3. Delete truck");
            System.out.println("4. Search by license plate");
            System.out.println("5. Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iTruckService.addTruck();
                    break;
                case 2:
                    iTruckService.displayTruck();
                    break;
                case 3:
                    iTruckService.deleteTruck();
                    break;
                case 4:
                    iTruckService.searchTruck();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }
}
