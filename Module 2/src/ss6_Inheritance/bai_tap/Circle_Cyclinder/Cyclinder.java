package ss6_Inheritance.bai_tap.Circle_Cyclinder;

public class Cyclinder extends Circle{
    private double height = 10;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return this.height*getArea();
    }

    @Override
    public String toString() {
        return "Cyclinder {" +
                "height=" + height +
                '}';
    }

    public static class CyclinderTest{
        public static void main(String[] args) {
            Cyclinder cyclinder = new Cyclinder();
            System.out.println(cyclinder);
            System.out.println("Volume of Cyclinder is: " + cyclinder.getVolume());
            Cyclinder cyclinder1 = new Cyclinder();
            cyclinder1.setRadius(5);
            cyclinder1.setColor("Blue");
            cyclinder1.setHeight(15);
            System.out.println(cyclinder1);
            System.out.println("Volume of Cyclinder 1 is: " + cyclinder1.getVolume());

        }
    }
}
