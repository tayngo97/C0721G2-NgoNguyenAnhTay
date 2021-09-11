package bai7_abstract_interface.thuchanh.animal;

import bai7_abstract_interface.thuchanh.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return " Chicken : cluck-cluck ";
    }

    @Override
    public String howToEat() {
        return " could be fried ";
    }
}
