public class App {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Yerbol", "12345");
        Driver driver2 = new Driver("Yerbol2", "123456");

        Car car1 = new Car("Toyota", 2020, 4, "Petrol");
        Car car2 = new Car("Honda", 2021, 4, "Petrol");

        Motorcycle motorcycle1 = new Motorcycle("Harley", 2019, false);
        Motorcycle motorcycle2 = new Motorcycle("Honda", 2020, true);

        Truck truck1 = new Truck("Ford", 2022, 5000, 4);
        Truck truck2 = new Truck("Chevrolet", 2023, 6000, 6);

        car1.setDriver(driver1);
        motorcycle1.setDriver(driver1);
        motorcycle2.setDriver(driver1);

        car2.setDriver(driver2);
        truck1.setDriver(driver2);
        truck2.setDriver(driver2);

        Vehicle[] vehicleArray = new Vehicle[6];
        vehicleArray[0] = car1;
        vehicleArray[1] = car2;
        vehicleArray[2] = motorcycle1;
        vehicleArray[3] = motorcycle2;
        vehicleArray[4] = truck1;
        vehicleArray[5] = truck2;

        for (Vehicle vehicle : vehicleArray) {
            vehicle.startEngine();
            vehicle.displayInfo();
            vehicle.stopEngine();

            Driver driver = vehicle.getDriver();
            driver.displayDriverInfo();
        }
    }
}
