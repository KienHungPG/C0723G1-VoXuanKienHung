package ss7_AbstractClass_Interface.Thuc_hanh;
import ss7_AbstractClass_Interface.Thuc_hanh.animal.Animal;
import ss7_AbstractClass_Interface.Thuc_hanh.animal.Chicken;
import ss7_AbstractClass_Interface.Thuc_hanh.animal.Tiger;
import ss7_AbstractClass_Interface.Thuc_hanh.edible.Edible;
import ss7_AbstractClass_Interface.Thuc_hanh.fruit.Apple;
import ss7_AbstractClass_Interface.Thuc_hanh.fruit.Orange;
import ss7_AbstractClass_Interface.Thuc_hanh.fruit.Fruit;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
