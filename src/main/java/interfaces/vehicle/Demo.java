package interfaces.vehicle;

public class Demo {
    public static void main(String[] args) {
        System.out.println("################################################################");
        Car car = new Car(1800);
        car.startVehicle();
        car.displayInfo();
    }
}
