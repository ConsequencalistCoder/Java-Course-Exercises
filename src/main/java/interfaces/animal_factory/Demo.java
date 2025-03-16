package interfaces.animal_factory;

public class Demo {
    public static void main(String[] args) {
        System.out.println("################################################################");
        CatFactory catFactory = new CatFactory();
        DogFactory dogFactory = new DogFactory();
        Animal catAnimal = catFactory.createAnimal();
        Animal dogAnimal = dogFactory.createAnimal();
        System.out.println("Cat: " + catAnimal);
        System.out.println("Dog: " + dogAnimal);
        catAnimal.eat();
        dogAnimal.eat();
    }
}
