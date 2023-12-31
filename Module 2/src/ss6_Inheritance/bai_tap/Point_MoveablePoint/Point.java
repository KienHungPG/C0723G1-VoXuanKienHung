package ss6_Inheritance.bai_tap.Point_MoveablePoint;

import ss6_Inheritance.bai_tap.Point2D_Point3D.Point3D;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    public Point(){
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
            float[] array = new float[2];
            array[0] = this.x;
            array[1] = this.y;
            return array;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public static class PointTest{
        public static void main(String[] args) {
            Point point = new Point();
            point.setX(3);
            point.setY(5);
            System.out.println(point);
        }
    }
}
