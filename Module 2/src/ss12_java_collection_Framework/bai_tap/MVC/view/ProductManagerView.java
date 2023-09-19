package ss12_java_collection_Framework.bai_tap.MVC.view;

import ss12_java_collection_Framework.bai_tap.MVC.controller.ProductController;
import ss12_java_collection_Framework.bai_tap.MVC.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductManagerView {
    private final ProductController productController = new ProductController();
    Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("=====MENU=====");
        System.out.println("1. Display products");
        System.out.println("2. Search product by name.");
        System.out.println("3. Create product.");
        System.out.println("4. Delete product.");
        System.out.println("5. Edit product's information.");
        System.out.println("6. Sort products by price.");
        System.out.println("0. Exit");
    }

    public void render() {
        int option = 0;

        do {
            showMenu();
            System.out.println("Enter feature:");
            option = Integer.parseInt(scanner.nextLine());

        } while (option < 0 || option > 6);

        switch (option) {
            case 1:
                List<Product> products = this.productController.getProduct();
                for(Product p: products) {
                    System.out.println(
                            "@id: " + p.getId() + " ,name: " + p.getName() + " ,price: " + p.getPrice()
                    );
                }

                break;
            case 2:
                System.out.println("Enter name of product to search: ");
                String name = scanner.nextLine();
                System.out.println(this.productController.searchProductByName(name));
                break;
            case 3:
                this.productController.createProduct(inputProductInformation());
                break;
            case 4:
                System.out.println("Enter id of product to delete:");
                int id = Integer.parseInt(scanner.nextLine());
                this.productController.deleteProduct(id);
                break;
            case 5:
                this.productController.updateInformation(updateProductInformation());
                break;
            case 6:

                System.out.println("Enter '+' to sort ascending, '-' to sort descending (by price)");
                String choice = scanner.nextLine();
                System.out.println(this.productController.sortProductByPrice(choice));
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("option is invalid");
                break;
        }
        render();

    }

    private boolean checkId(int id){
        boolean flag = false;
        for (Product p: productController.getProduct()) {
            if (id == p.getId()){
                flag = true;
            }
        }
        return flag;
    }

    private Product inputProductInformation() {
        Product product = new Product();

        System.out.println("Input the name of product:");
        product.setName(scanner.nextLine());

        System.out.println("Input price of product:");
        product.setPrice(Integer.parseInt(scanner.nextLine()));

        return product;
    }

    private Product updateProductInformation() {

        Product product = new Product();
        System.out.println("Input the id of product to update:");
        int id = Integer.parseInt(scanner.nextLine());
        if (checkId(id)){
            System.out.println("Input the name of product to update:");
            product.setName(scanner.nextLine());

            System.out.println("Input price of product to update:");
            product.setPrice(Integer.parseInt(scanner.nextLine()));
            product.setId(id);
        }
        return product;
    }

}



