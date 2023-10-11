package luyentap3.view;

import luyentap3.controller.FruitController;
import luyentap3.model.Fruit;
import luyentap3.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class FruitManagement {
    Scanner scanner = new Scanner(System.in);
    private final FruitController fruitController = new FruitController();

    public void displayMenu() {
        System.out.println("---MENU---");
        System.out.println("1. Display list fruits");
        System.out.println("2. Add new fruit");
        System.out.println("3. Delete fruit");
        System.out.println("4. Search fruit by code");
        System.out.println("5. Search fruit by name");
        System.out.println("6. Edit fruit");
        System.out.println("7. Exit");
    }

    public void managementFruit() {
        int choose = chooseMenu();
        switch (choose) {
            case 1:
                for (Fruit fruit : fruitController.getList()) {
                    System.out.println(fruit);
                }
                break;
            case 2:
                fruitController.add(addNewFruit());
                break;
            case 3:
                String codeDelete = inputCode();
                if (checkCode(codeDelete)) {
                    fruitController.delete(codeDelete);
                } else {
                    System.out.println("Not Found");
                }
                break;
            case 4:
                String codeSearch = inputCode();
                if (checkCode(codeSearch)) {
                    fruitController.searchByCode(codeSearch);
                } else {
                    System.out.println("Not found");
                }
                break;
            case 5:
                String nameSearch = inputName();
                List<Fruit> fruits = fruitController.getList();
                if (fruits.size() == 0) {
                    System.out.println("Not found");
                } else {
                    for (Fruit fruit : fruits) {
                        System.out.println(fruit);
                    }
                }
                break;
            case 6:
                Fruit fruit = edit();
                if (fruit == null){
                    System.out.println("Not found");
                }else {
                    fruitController.edit(fruit);
                }
                break;
            case 7:
                System.exit(1);
        }
        this.managementFruit();
    }

    public int chooseMenu() {
        int choose;
        do {
            try {
                this.displayMenu();
                System.out.println("Choose the feature");
                choose = Integer.parseInt(scanner.nextLine());
                if (choose <= 0 || choose > 7) {
                    System.out.println("Invalid. Please re-enter!!!");
                } else {
                    return choose;
                }
            } catch (NumberFormatException e) {
                System.out.println("Feature must be a number");
            }
        } while (true);
    }

    public String inputCode() {
        String code;
        do {
            System.out.println("Enter fruit's code FR-XXX(X is integer): ");
            code = scanner.nextLine();
            if (Regex.fruitCodeValidate(code)) {
                return code;
            } else {
                System.out.println("Invalid code. Please re-enter!!!");
            }
        } while (true);
    }

    public boolean checkCode(String code) {
        for (Fruit fruit : fruitController.getList()) {
            if (fruit.getCode().equals(code)) {
                return true;
            }
        }
        return false;
    }

    public String inputName() {
        String name;
        do {
            System.out.println("Enter fruit's name: ");
            name = scanner.nextLine().trim();
            if (name.equals("")) {
                System.out.println("Name can not null. Please re-enter");
            } else {
                break;
            }
        } while (true);
        return name;
    }

    public String inputOrigin() {
        int choose;
        do {
            try {
                System.out.println("Choose fruit's origin");
                System.out.println("1. VN");
                System.out.println("2. USA");
                System.out.println("3. TL");
                choose = Integer.parseInt(scanner.nextLine());
                if (choose <= 0 || choose > 3) {
                    System.out.println("Invalid. Please re-enter!!!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Option must be a number 1->3");
            }
        } while (true);
        if (choose == 1) {
            return "VN";
        } else if (choose == 2) {
            return "USA";
        } else {
            return "TL";
        }
    }

    public int inputAmount() {
        int amount;
        do {
            try {
                System.out.println("Enter amount of fruits");
                amount = Integer.parseInt(scanner.nextLine());
                if (amount > 0) {
                    return amount;
                } else {
                    System.out.println("Amount must be greater than 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Amount must be a number");
            }
        } while (true);
    }

    public double inputPrice() {
        double price;
        do {
            try {
                System.out.println("Enter price of fruits");
                price = Double.parseDouble(scanner.nextLine());
                if (price > 0) {
                    return price;
                } else {
                    System.out.println("Price must be greater than 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Price must be a number");
            }
        } while (true);
    }

    public void inputAll(Fruit fruit) {
        fruit.setName(inputName());
        fruit.setOrigin(inputOrigin());
        fruit.setAmount(inputAmount());
        fruit.setPrice(inputPrice());
    }

    public Fruit addNewFruit() {
        Fruit fruit = new Fruit();
        String fruitCode;
        do {
            fruitCode = inputCode();
            if (checkCode(fruitCode)) {
                System.out.println("Computer code is exits. Please re-enter!!!");
            }
            fruit.setCode(inputCode());
            inputAll(fruit);
        } while (true);
    }

    public Fruit edit() {
        String fruitCode = inputCode();
        for (Fruit fruit : fruitController.getList()) {
            if (fruit.getCode().equals(fruitCode)){
                inputAll(fruit);
                return fruit;
            }
        }
        return null;
    }

}