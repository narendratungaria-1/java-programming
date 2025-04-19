package project;
import java.util.ArrayList;

public class CarShowroom {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        // Adding Sedan cars
        cars.add(new Sedan("Toyota", "Camry", 2022, 24425, 400));
        cars.add(new Sedan("Honda", "Accord", 2021, 24970, 450));

        // Adding SUV cars
        cars.add(new SUV("Ford", "Explorer", 2022, 32995, 7));
        cars.add(new SUV("Chevrolet", "Tahoe", 2021, 49900, 8));

        // Adding Truck cars
        cars.add(new Truck("Tata", "1500", 2022, 32995, 2.3));
        cars.add(new Truck("Ford", "F-150", 2021, 29995, 1.5));

        // Displaying all cars
        for (Car car : cars) {
            car.displayInfo();
            System.out.println();
        }
    }
}
