package ss5_accessmoderfier_static.bai_tap.Access_moderfier2;

public class TestedStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Hung");
        student.setClasses("C0723G1");
        System.out.println(student);
    }
}
/*
Dùng private cho setName và setClasses thì chương trình bị lỗi do private chỉ được sử dụng trong cùng 1 class
Dùng protected cho setName và setClasses thì chương trình vẫn chạy được
Khi default chương trình vẫn hoạt động
*/
