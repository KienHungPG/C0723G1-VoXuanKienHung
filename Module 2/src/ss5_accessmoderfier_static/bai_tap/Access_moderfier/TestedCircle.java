package ss5_accessmoderfier_static.bai_tap.Access_moderfier;

public class TestedCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Radius of circle is: " + circle.getRadius());
        System.out.println("Area of circle is: " + circle.getArea());
    }
}

/*
Dùng private cho getRadius và getArea thì chương trình bị lỗi do private chỉ được sử dụng trong cùng 1 class
Dùng protected cho getRadius và getArea thì chương trình vẫn chạy được
Khi default chương trình vẫn hoạt động
*/
