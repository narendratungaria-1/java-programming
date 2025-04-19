package project;

public class Sedan extends Car {
    private int trunkCapacity; // in liters

    public Sedan(String make, String model, int year, double price, int trunkCapacity) {
        super(make, model, year, price);
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Trunk Capacity: " + trunkCapacity + " liters");
    }
}