package ss7_AbstractClass_Interface.Bai_tap.interface_Resizeable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2.0);
        shapes[1] = new Rectangle(3.2, 5.8);
        shapes[2] = new Square(4);
        System.out.println("Before resize");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].resize(Math.random() * 100);
        }
        System.out.println("After resize");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
