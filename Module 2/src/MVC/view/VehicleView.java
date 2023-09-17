package MVC.view;

import MVC.controller.CarController;
import MVC.controller.MotocycleController;
import MVC.controller.TruckController;

import java.util.Scanner;

public class VehicleView {
    public static void main(String[] args) {
        System.out.println("Select your option");
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("1. Car ");
            System.out.println("2. Truck ");
            System.out.println("3. Motorcycle ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    CarController.menuCar();
                case 2:
                    TruckController.menuTruck();
                case 3:
                    MotocycleController.menuMotorcycle();
            }
        } while (choose < 1 || choose > 3);


    }
}
