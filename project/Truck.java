package project;
public class Truck extends Car {
    private double payloadCapacity; // in tons

    public Truck(String make, String model, int year, double price, double payloadCapacity) {
        super(make, model, year, price);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
    }
}