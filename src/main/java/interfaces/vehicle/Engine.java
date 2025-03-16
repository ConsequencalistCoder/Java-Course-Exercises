package interfaces.vehicle;

public class Engine {

    private final Integer horsePower;

    public Engine(int horsePower) {
        //The input parameter is int, so that it can't be null
        this.horsePower = horsePower;
    }

    public Integer getHorsePower() {
        return this.horsePower;
    }

    public void start() {
        System.out.println("Engine started!");
    }
}
