package ss15_exception.bai_tap;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        try {
            double side1 = checkInput("Enter the length of the first side: ");
            double side2 = checkInput("Enter the length of the second side: ");
            double side3 = checkInput("Enter the length of the third side: ");

            checkTriangle(side1, side2, side3);

            System.out.println("Valid triangle!");
        } catch (IllegalTriangleException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static double checkInput(String string) {
        double value;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(string);
                value = Double.parseDouble(scanner.nextLine());
                if (value <= 0) {
                    System.out.println("Error: The value must be a positive integer.");
                } else {
                    return value;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Error: The value must be a number.");
            }
        }
    }

    private static void checkTriangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("The sides do not fit into a triangle.");
        }
    }
}
