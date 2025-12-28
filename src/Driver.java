public class Driver {
    String name;
    String licensNumber;

    public Driver(String name, String licensNumber) {
        this.name = name;
        this.licensNumber = licensNumber;
    }

    public void displayDriverInfo() {
        System.out.println("Name: " + name + "\nLicense Number: " + licensNumber);
    }
}
