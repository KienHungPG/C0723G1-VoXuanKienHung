package ss6_Inheritance.bai_tap.Circle_Cyclinder;

public class Circle {
    private double radius = 3.0;
    private String color = "Black";

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Circle(){
    }
    public Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }
    public double getArea() {
        return Math.pow(radius,2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle {" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
    public static class CircleTest {
        public static void main(String[] args) {
            Circle circle1 = new Circle();
            System.out.println(circle1);
            System.out.println("Area of circle 1 is: " +circle1.getArea());
            Circle circle2 = new Circle(5.0,"Pink");
            System.out.println(circle2);
            System.out.println("Area of circle 2 is: " +circle2.getArea());
        }
    }
}
