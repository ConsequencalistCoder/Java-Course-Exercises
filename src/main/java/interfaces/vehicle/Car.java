package interfaces.vehicle;

public class Car implements Vehicle {

    private final Engine engine;

    public Car(int horsePower) {
        this.engine = new Engine(horsePower);
    }

    @Override
    public void startVehicle() {
        this.engine.start();
    }

    public void displayInfo() {
        System.out.println("Engine power is: " + this.engine.getHorsePower());
    }
}
