public abstract class Vehicle {
    int id;
    String brand;
    String model;
    int year;

    public Vehicle(int id, String brand, String model, int year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    abstract void startEngine();
    abstract void stopEngine();
    abstract void accelerate(int speed);
    abstract void brake();
    abstract void displayInfo();
}
