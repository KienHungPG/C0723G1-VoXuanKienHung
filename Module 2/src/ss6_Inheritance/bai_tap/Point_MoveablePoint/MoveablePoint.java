package ss6_Inheritance.bai_tap.Point_MoveablePoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(){
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] array = new float[2];
        array[0] = this.getX();
        array[1] = this.getY();
        return array;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x=" + getX() +
                ", y=" + getY() +
                '}';
    }
    public MoveablePoint move(){
        this.setX(this.getX()+this.getXSpeed());
        this.setY(this.getY()+this.getYSpeed());
        return this;
    }

    public static class MoveablePointTest{
        public static void main(String[] args) {
            MoveablePoint moveablePoint = new MoveablePoint();
            moveablePoint.setX(5);
            moveablePoint.setY(9);
            System.out.println("x = " + moveablePoint.getX());
            System.out.println("y = " + moveablePoint.getY());

            MoveablePoint moveablePoint1 = new MoveablePoint(1,2,4,6);
            System.out.println(moveablePoint1);
            System.out.println(moveablePoint1.move());
        }
    }
}
