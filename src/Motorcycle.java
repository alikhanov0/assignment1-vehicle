public class Motorcycle extends Vehicle {
    boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the motorcycle engine.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping the motorcycle engine.");
    }
}
