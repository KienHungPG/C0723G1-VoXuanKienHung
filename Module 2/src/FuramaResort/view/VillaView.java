package FuramaResort.view;

import FuramaResort.model.infrastructure.Villa;
import FuramaResort.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class VillaView {
    Scanner scanner = new Scanner(System.in);

    public void displayVillaMenu(){
        System.out.println("-----VILLA MENU-----");
        System.out.println("1. Display list villa");
        System.out.println("2. Add new villa");
        System.out.println("3. Display list villa maintenance");
        System.out.println("4. Delete villa");
        System.out.println("5. Return facility menu");
    }
    public void displayVilla(List<Villa> villaList) {
        if (villaList.size() == 0) {
            System.out.println("Empty list");
        } else {
            for (Villa villa : villaList) {
                System.out.println("List of employees: " + villa);
            }
        }
    }

//    public Villa inputVilla(){
//        String serviceCode;
//        String serviceName;
//        double usableArea = 0;
//        int rentalCosts = 0;
//        int maxPeople = 0;
//        String rentalType;
//        String typeOfRoom;
//        int numberOfFloor;
//        double poolArea;
//        do {
//            System.out.println("Enter the service code as SVVL-YYYY: ");
//            serviceCode = scanner.nextLine();
//            if (!Regex.villaCodeValidate(serviceCode)) {
//                System.out.println("Invalid service code, please re-enter");
//            }
//        } while (!Regex.villaCodeValidate(serviceCode));
//        do {
//            System.out.println("Enter the service's name: ");
//            serviceName = scanner.nextLine();
//            if (!Regex.serviceNameValidate(serviceName)) {
//                System.out.println("Invalid service name, please re-enter");
//            }
//        } while (!Regex.serviceNameValidate(serviceName));
//        do {
//            try {
//                System.out.println("Enter the usable area (> 30m2): ");
//                usableArea = Double.parseDouble(scanner.nextLine());
//                if (usableArea < 0) {
//                    System.out.println("Area must be greater than 0, please re-enter: ");
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("Area requires a number, please re-enter: ");
//            }
//        } while (usableArea <= 30);
//        do {
//            try {
//                System.out.println("Enter rental costs: ");
//                rentalCosts = Integer.parseInt(scanner.nextLine());
//                if (rentalCosts < 0) {
//                    System.out.println("Rental cost must be greater than 0, please re-enter: ");
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("Rental cost must be a number, please re-enter: ");
//            }
//        } while (rentalCosts <= 0);
//        do {
//            try {
//                System.out.println("Enter the maximum number of people (0 > People <= 20): ");
//                maxPeople = Integer.parseInt(scanner.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("Number of people must be number, please re-enter: ");
//            }
//        } while (maxPeople <= 0 || maxPeople > 20);
//        do {
//            System.out.println("Enter rental type(Year|Month|Day|Hourly): ");
//            rentalType = scanner.nextLine();
//            if (!Regex.rentalTypeValidate(rentalType)) {
//                System.out.println("Rental type invalid, please re-enter: ");
//            }
//        } while (!Regex.rentalTypeValidate(rentalType));
//
//    }
}
