package ss7_AbstractClass_Interface.Bai_tap.interface_Colorable;

public class Square extends Shape implements IColorable {
    boolean colorable = false;
    double side;

    Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(boolean colorable, double side) {
        this.colorable = colorable;
        this.side = side;
    }

    @Override
    public void howToColor() {
        if (colorable)
            System.out.println("Color all four side!");
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "This Square's area is : " + getArea();
    }
}
