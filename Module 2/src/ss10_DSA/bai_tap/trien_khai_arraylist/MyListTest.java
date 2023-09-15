package ss10_DSA.bai_tap.trien_khai_arraylist;

import java.util.List;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>(6);
        MyList<String> myList2;
        myList.add("1");
        myList.add("2");
        myList.add("4");
        myList.add("5");
        myList.add("6");
        myList.add("7");
        myList.add(2,"3");
        System.out.println(myList);
        System.out.println("Phần tử bị xóa đi " +myList.get(2));
        myList.remove(2);
        System.out.println("Mảng sau khi xóa");
        System.out.println(myList);

        myList2 = (MyList<String>) myList.clone();
        System.out.println(myList2);
        System.out.println(myList.contains("3"));
        System.out.println(myList.indexOf("4"));
        myList2.clear();
        System.out.println(myList2);

    }
}
