package interfaces.animal_factory;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog eats!");
    }
}
