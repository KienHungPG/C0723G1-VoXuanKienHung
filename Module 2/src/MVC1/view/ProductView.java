package MVC1.view;

import MVC1.controller.ProductController;

import java.util.Scanner;

public class ProductView {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ProductController.showMenu();
    }
}
