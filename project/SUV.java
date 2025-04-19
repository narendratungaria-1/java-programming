package project;

public class SUV extends Car {
    private int seatingCapacity;

    public SUV(String make, String model, int year, double price, int seatingCapacity) {
        super(make, model, year, price);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seating Capacity: " + seatingCapacity + " persons");
    }
}
