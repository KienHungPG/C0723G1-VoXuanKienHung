package MVC1.controller;

import MVC1.service.IProductService;
import MVC1.service.ProductService;

import java.util.Scanner;

public class ProductController {
    public static Scanner scanner = new Scanner(System.in);
    public static void showMenu(){
        IProductService productService = new ProductService();
        int selection = 0;
        do {
            System.out.println("\n---Danh sách quản lý sản phẩm---");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Xem danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm");
            System.out.println("6. Sắp xếp giá sản phẩm tăng/ giảm dần");
            System.out.println("0. Exit Menu\n");
            selection = Integer.parseInt(scanner.nextLine());
            switch (selection){
                case 1:
                    productService.addProduct();
                    break;
                case 2:
                    productService.editProduct();
                    break;
                case 3:
                    productService.deleteProduct();
                    break;
                case 4:
                    productService.showAll();
                    break;
                case 5:
                    productService.searchByName();
                    break;
                case 6:
                    productService.sortByPriceProduct();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
