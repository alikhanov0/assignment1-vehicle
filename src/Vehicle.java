abstract class Vehicle {
    private String brand;
    private int year;
    private Driver driver;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        this.driver = null;
    }

    abstract void startEngine();

    abstract void stopEngine();

    public void setDriver(Driver driver) {
        this.driver = driver;
        return;
    }

    public Driver getDriver() {
        return driver;
    }

    void displayInfo() {
        System.out.printf("Brand: " + brand + "\nYear: " + year + "\n");
    }
}