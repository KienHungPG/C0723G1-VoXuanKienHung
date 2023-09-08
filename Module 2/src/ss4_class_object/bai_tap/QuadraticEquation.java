package ss4_class_object.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }

    public void display() {
        if (getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        } else if (getDiscriminant() == 0) {
            System.out.println("The equation has 1 root x= " + getRoot1());
        } else {
            System.out.println("The equation has 2 roots: \nx1 = " + getRoot1() + "\nx2 = " + getRoot2());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("Find the solution of the quadratic equation ax2 + bx +c = 0 (a is not 0) ");
        do {
            System.out.println("Enter a: ");
            a = scanner.nextDouble();
            if (a != 0) {
                break;
            }else {
                System.out.println("a is not 0!");
            }
        } while (true);

        System.out.println("Enter b: ");
        b = scanner.nextDouble();
        System.out.println("Enter c: ");
        c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.setA(a);
        quadraticEquation.setB(b);
        quadraticEquation.setC(c);
        quadraticEquation.display();
    }
}
