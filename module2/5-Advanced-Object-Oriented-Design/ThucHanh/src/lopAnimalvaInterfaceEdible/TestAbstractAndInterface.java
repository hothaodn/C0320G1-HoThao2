package lopAnimalvaInterfaceEdible;

public class TestAbstractAndInterface {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for( Animal animal: animals){
            System.out.println(animal.makeSound());;
        }
        //System.out.println(animals);

        Fruits[] fruits = new Fruits[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for( Fruits fruits1 : fruits){
            System.out.println(fruits1.howToEat());
        }
        //System.out.println(fruits);
    }
}
