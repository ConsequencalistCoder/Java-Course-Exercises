package interfaces.appliances;

public class Demo {
    public static void main(String[] args) {
        System.out.println("################################################################");
        Refrigerator refrigerator = new Refrigerator();
        WashingMachine washingMachine = new WashingMachine();
        refrigerator.turnOn();
        refrigerator.functionality();
        washingMachine.turnOn();
        washingMachine.functionality();
    }
}
