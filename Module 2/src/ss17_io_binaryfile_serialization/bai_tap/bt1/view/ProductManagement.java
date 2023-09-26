package ss17_io_binaryfile_serialization.bai_tap.bt1.view;

import ss17_io_binaryfile_serialization.bai_tap.bt1.controller.ProductController;
import ss17_io_binaryfile_serialization.bai_tap.bt1.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    private final Scanner scanner = new Scanner(System.in);

    private final ProductController productController = new ProductController();

    public void showMenu() {
        System.out.println("----------Product Management----------");
        System.out.println("1. Add Product");
        System.out.println("2. Display Product");
        System.out.println("3. Search Product");
        System.out.println("4. Exit");
    }

    public int chooseFunction() {
        int choice = 0;
        showMenu();
        do {
            try {
                System.out.println("Please choose function");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 1 || choice > 4) {
                    System.out.println("Choice must be a number from 1 to 4!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Choice must be a number!");
            }
        } while (choice < 1 || choice > 3);

        if (choice == 4) {
            System.exit(4);
        }
        return choice;
    }

    public void manage() {
        int choice;
        do {
            choice = this.chooseFunction();
            switch (choice) {
                case 1:
                    this.productController.addProduct(inputProduct());
                    break;
                case 2:
                    List<Product> products = productController.displayProduct();
                    for (Product p : products) {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.println(this.productController.searchProduct(this.inputName()));
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 4);
    }

    public Product inputProduct() {
        Product product = new Product();
        System.out.println("Enter product's id: ");
        product.setId(scanner.nextLine());
        System.out.println("Enter product's name: ");
        product.setName(scanner.nextLine());
        System.out.println("Enter product's price: ");
        product.setPrice(Float.parseFloat(scanner.nextLine()));
        System.out.println("Enter product's manufacturer: ");
        product.setManufacturer(scanner.nextLine());
        System.out.println("Enter product's detail: ");
        product.setDetail(scanner.nextLine());
        return product;
    }

    public String inputName() {
        System.out.println("Enter product's name: ");
        return scanner.nextLine();
    }
}
