abstract class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    abstract void startEngine();

    abstract void stopEngine();

    void displayInfo() {
        System.out.println("Brand: " + brand + "\nYear: " + year);
    }
}