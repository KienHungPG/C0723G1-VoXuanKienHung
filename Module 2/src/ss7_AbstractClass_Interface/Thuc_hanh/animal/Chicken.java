package ss7_AbstractClass_Interface.Thuc_hanh.animal;
import ss7_AbstractClass_Interface.Thuc_hanh.edible.Edible;
public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
