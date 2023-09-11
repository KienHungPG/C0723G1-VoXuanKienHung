package ss6_Inheritance.bai_tap.Point2D_Point3D;

public class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }
    public Point3D(){
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.setXY(x,y);
        this.setZ(z);
    }
    public float[] getXYZ(){
        float[] array = new float[3];
        array[0] = this.getX();
        array[1] = this.getY();
        array[2] = this.getZ();
        return array;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}';
    }

    public static class Point3DTest{
        public static void main(String[] args) {
            Point3D point3D = new Point3D();
            System.out.println(point3D);
            point3D.setX(3);
            point3D.setY(10);
            point3D.setZ(5);
            System.out.println("x = " + point3D.getX());
            System.out.println("y = " + point3D.getY());
            System.out.println("z = " + point3D.getZ());

            point3D.setXYZ(7,8,9);
            System.out.println("x = " + point3D.getX());
            System.out.println("y = " + point3D.getY());
            System.out.println("z = " + point3D.getZ());
        }
    }
}
