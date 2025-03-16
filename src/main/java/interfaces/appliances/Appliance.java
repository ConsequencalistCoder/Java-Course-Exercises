package interfaces.appliances;

public abstract class Appliance {

    public void turnOn() {
        System.out.println("The appliance is turned on!");
    }

    public abstract void functionality();

}
