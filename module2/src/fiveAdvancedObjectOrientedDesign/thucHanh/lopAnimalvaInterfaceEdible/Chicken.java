package fiveAdvancedObjectOrientedDesign.thucHanh.lopAnimalvaInterfaceEdible;

import lopAnimalvaInterfaceEdible.Animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chickens cockadoodledoo cockadoodledoo";
    }

    @Override
    public String howToEat() {
        return "fried chicken, KFC";
    }
}
