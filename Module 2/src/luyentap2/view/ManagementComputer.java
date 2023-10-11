package luyentap2.view;

import luyentap2.Utils.Regex;
import luyentap2.controller.ComputerController;
import luyentap2.model.Computer;
import luyentap2.repository.ComputerRepository;
import luyentap2.repository.IComputerRepository;

import java.util.List;
import java.util.Scanner;

public class ManagementComputer {
    private final Scanner scanner = new Scanner(System.in);
    private final ComputerController computerController = new ComputerController();

    public void displayMenu() {
        System.out.println("---MENU---");
        System.out.println("1. Display list computers");
        System.out.println("2. Add new computer");
        System.out.println("3. Delete computer");
        System.out.println("4. Edit computer");
        System.out.println("5. Search computer by code");
        System.out.println("6. Search computer by name");
        System.out.println("7. Exit");
    }

    public int chooseMenu() {
        int chooseMenu;
        do {
            try {
                this.displayMenu();
                System.out.println("Choose feature in menu");
                chooseMenu = Integer.parseInt(scanner.nextLine());
                if (chooseMenu <= 0 || chooseMenu > 7) {
                    System.out.println("Invalid. Please re-enter!!!");
                } else {
                    return chooseMenu;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter number");
            }
        } while (true);
    }

    public void managementComputer() {
        int choose = chooseMenu();
        switch (choose) {
            case 1:
                computerController.getList();
                break;
            case 2:
                computerController.add(addNewComputer());
                break;
            case 3:
                String deleteCode = inputComputerCode();
                if (checkCode(deleteCode)) {
                    computerController.delete(deleteCode);
                    System.out.println("Successful");
                } else {
                    System.out.println("Not found");
                }
                break;
            case 4:
                Computer computer = editComputer();
                if (computer == null) {
                    System.out.println("Not found!!!");
                } else {
                    computerController.edit(computer);
                    System.out.println("Edit successful!!!");
                }
                break;
            case 5:
                String name = inputComputerName();
                List<Computer> computers = computerController.searchByName(name);
                if (computers.size() == 0) {
                    System.out.println("Not found computer name: " + name);
                } else {
                    for (Computer computer1 : computers) {
                        System.out.println(computer1);
                    }
                }
                break;
            case 6:
                String code = inputComputerCode();
                List<Computer> computerList = computerController.searchByCode(code);
                if (computerList.size() == 0) {
                    System.out.println("Not found computer code: " + code);
                } else {
                    for (Computer computer1 : computerList) {
                        System.out.println(computer1);
                    }
                }
                break;
            case 7:
                System.exit(1);
        }
        this.managementComputer();
    }

    public String inputComputerCode() {
        String computerCode;
        do {
            System.out.println("Enter the computer code MT-XXXX(X is integer): ");
            computerCode = scanner.nextLine();
            if (Regex.computerCodeValidate(computerCode)) {
                return computerCode;
            } else {
                System.out.println("Computer code invalid. Please re-enter!!!");
            }
        } while (true);
    }

    public boolean checkCode(String code) {
        for (Computer computer : computerController.getList()) {
            if (computer.getCode().equals(code)) {
                return true;
            }
        }
        return false;
    }

    public String inputComputerName() {
        String computerName;
        do {
            System.out.println("Enter the computer's name: ");
            computerName = scanner.nextLine().trim();
            if (computerName.equals("")) {
                System.out.println("Can not null. Please re-enter!!!");
            } else {
                break;
            }
        } while (true);
        return computerName;
    }

    public String inputComputerSize() {
        int chooseSize;
        do {
            try {
                System.out.println("Choose size of computer");
                System.out.println("1. Big");
                System.out.println("2. Medium");
                System.out.println("3. Small");
                chooseSize = Integer.parseInt(scanner.nextLine());
                if (chooseSize <= 0 || chooseSize > 3) {
                    System.out.println("Invalid. Please re-enter!!!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter number!!!");
            }
        } while (true);
        if (chooseSize == 1) {
            return "Big";
        } else if (chooseSize == 2) {
            return "Medium";
        } else {
            return "Small";
        }
    }

    public String inputComputerType() {
        int chooseType;
        do {
            try {
                System.out.println("Choose type of computer");
                System.out.println("1. Gaming Computer");
                System.out.println("2. Office Computer");
                System.out.println("3. AIO Computer");
                chooseType = Integer.parseInt(scanner.nextLine());
                if (chooseType <= 0 || chooseType > 3) {
                    System.out.println("Invalid. Please re-enter!!!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter number!!!");
            }
        } while (true);
        if (chooseType == 1) {
            return "Gaming Computer";
        } else if (chooseType == 2) {
            return "Office Computer";
        } else {
            return "AIO Computer";
        }
    }

    public int inputPrice() {
        int price;
        do {
            try {
                System.out.println("Enter price of computer");
                price = Integer.parseInt(scanner.nextLine());
                if (price > 0) {
                    return price;
                } else {
                    System.out.println("Price must be greater than 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter number");
            }
        } while (true);
    }

    public void inputInformation(Computer computer) {
        computer.setName(inputComputerName());
        computer.setPrice(inputPrice());
        computer.setSize(inputComputerSize());
        computer.setType(inputComputerType());
    }

    public Computer addNewComputer() {
        Computer computer = new Computer();
        String computerCode;
        do {
            computerCode = inputComputerCode();
            if (checkCode(computerCode)) {
                System.out.println("Computer code is exist. Please re-enter!!!");
            }
            computer.setCode(computerCode);
            inputInformation(computer);
        } while (true);

    }

    public Computer editComputer() {
        String computerCode = inputComputerCode();
        for (Computer computer : computerController.getList()) {
            if (computer.getCode().equals(computerCode)) {
                inputInformation(computer);
                return computer;
            }
        }
        return null;
    }

}
