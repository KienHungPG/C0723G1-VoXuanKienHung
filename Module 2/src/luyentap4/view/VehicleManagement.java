package luyentap4.view;

import luyentap4.utils.Regex;

import java.util.Scanner;

public class VehicleManagement {
    Scanner scanner = new Scanner(System.in);
    public void displayMenu(){
        System.out.println("---MENU---");
        System.out.println("1. Display list vehicles");
        System.out.println("2. Add new vehicle");
        System.out.println("3. Delete vehicle by plate");
        System.out.println("4. Search vehicle by name");
        System.out.println("5. Search vehicle by plate");
        System.out.println("6. Edit vehicle by plate");
        System.out.println("7. Exit");
    }
    public int chooseMenu(){
        int choose;
        do {
            try {
                this.displayMenu();
                System.out.println("Choose the feature");
                choose = Integer.parseInt(scanner.nextLine());
                if (choose <= 0 || choose > 7){
                    System.out.println("Invalid. Please re-enter feature 1->7");
                }else {
                    return choose;
                }
            }catch (NumberFormatException e){
                System.out.println("Feature must be a integer!!!");
            }
        }while (true);
    }
    public void vehicleManagement(){
        int choose = chooseMenu();
        switch (choose){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        this.vehicleManagement();
    }
    public String inputPlate(){
        String plate;
        do {
            System.out.println("Enter plate of vehicle CAR-XXXX(X is integer): ");
            plate = scanner.nextLine();
            if (Regex.vehicleCodeValidate(plate)) {
                return plate;
            }else {
                System.out.println("Plate invalid. Please re-enter");
            }
        }while (true);
    }
    public String inputNameVehicle(){
        String name;
        do {
            System.out.println("Enter name of vehicle: ");
            name = scanner.nextLine().trim();
            if (name.equalsIgnoreCase("")){
                System.out.println("Name can not null. Please re-enter!!!");
            }
            return name;
        }while (true);
    }
    public String inputTypeVehicle(){
        String type;
        do {
            System.out.println("Enter type of vehicle (tourist/personal): ");
            type = scanner.nextLine();
            if (Regex.vehicleTypeValidate(type)){
                return type;
            }else {
                System.out.println("Invalid type of vehicle. Please re-enter");
            }
        }while (true);
    }
    public String inputManufacturer(){
        String manufacturer;
        do {
            System.out.println("Enter manufacturer(USA|KR|JP|GER): ");
            manufacturer = scanner.nextLine();
            if (Regex.manufacturerValidate(manufacturer)){
                return manufacturer;
            }else {
                System.out.println("Manufacturer invalid. Please re-enter!!!");
            }
        }while (true);
    }
    public Integer inputYearManufacturer(){
        int year;
        do {
            try {
                System.out.println("Enter year manufacturer: ");
                year = Integer.parseInt(scanner.nextLine());
                if (year >=  1900 && year <= 2023){
                    return year;
                }else {
                    System.out.println("Invalid. please re-enter");
                }
            }catch (NumberFormatException e){
                System.out.println("Year must be a number 1900-2023");
            }
        }while (true);
    }
    public String inputOwner(){
        String owner;
        do {
            System.out.println("Enter name of owner: ");
            owner = scanner.nextLine().trim();
            if (owner.equalsIgnoreCase("")){
                System.out.println("Owner can not null. Please re-enter");
            }
            return owner;
        }while (true);
    }
    public Double inputPrice(){
        double price;
        do {
           try {
               System.out.println("Enter price of vehicle: ");
               price = Double.parseDouble(scanner.nextLine());
               if (price > 0){
                   return price;
               }else {
                   System.out.println("Price must be greater than 0");
               }
           }catch (NumberFormatException e){
               System.out.println("Price must be a number");
           }
        }while (true);
    }
}
