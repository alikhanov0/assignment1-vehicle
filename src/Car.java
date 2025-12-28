public class Car extends Vehicle {
    int doors;
    String fuelType;

    public Car(String brand, int year, int doors, String fuelType) {
        super(brand, year);
        this.doors = doors;
        this.fuelType = fuelType;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the car engine.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping the car engine.");
    }
}
