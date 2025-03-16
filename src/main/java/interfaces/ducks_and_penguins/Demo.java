package interfaces.ducks_and_penguins;

public class Demo {
    public static void main(String[] args) {
        System.out.println("################################################################");
        Duck duck = new Duck();
        Penguin penguin = new Penguin();
        duck.fly();
        duck.swim();
        penguin.swim();
    }
}
