package lopAnimalvaInterfaceEdible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "cockadoodledoo cockadoodledoo";
    }

    @Override
    public String howToEat() {
        return "Rice";
    }
}
