package ss4_class_object.bai_tap;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

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

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        String state = "";
        if (this.isOn()) {
            state += ("Fan is on.\n");
            state += ("Speed is " + this.speed + "\n");
        } else {
            state += ("Fan is off.\n");
        }
        state += ("Color is " + this.color + "\n");
        state += ("Radius is " + this.radius + "\n");
        return state;
    }

    public static class Check {
        public static void main(String[] args) {
            Fan fan1 = new Fan(3, true, 10, "Yellow");
            Fan fan2 = new Fan(2, false, 5, "Blue");
            System.out.println("Fan 1: ");
            System.out.println(fan1.toString());
            System.out.println("Fan 2: ");
            System.out.println(fan2.toString());
            fan2.setOn(true);
            System.out.println("Fan 2: ");
            System.out.println(fan2.toString());
        }
    }
}

