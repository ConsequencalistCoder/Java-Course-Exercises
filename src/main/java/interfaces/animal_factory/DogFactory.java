package interfaces.animal_factory;

public class DogFactory implements AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
