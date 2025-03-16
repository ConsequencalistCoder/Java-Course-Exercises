package interfaces.ducks_and_penguins;

public class Penguin implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Penguin is swimming!");
    }
}
