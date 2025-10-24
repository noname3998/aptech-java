package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleManager {
    public List<Car> cars = new ArrayList<>();
    public List<Motorbike> bikes = new ArrayList<>();
    protected Scanner sc = new Scanner(System.in);

    public void inputCars() {

        System.out.println("nhap so luong xe: ");
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.println("xe thu " + i);
            Car car = new Car();
            cars.add(car);
        }
    }

    public void inputBikes() {

        System.out.println("nhap so luong xe: ");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("xe thu " + i);
            Motorbike bike = new Motorbike();
            bikes.add(bike);
        }
    }

    public void displayCarsSortedByPriceDesc() {
        cars.sort((v1, v2) -> Double.compare(v2.getPrice(), v1.getPrice()));
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("--- thong tin xe thu " + i + " la ---");
            cars.get(i).display();
        }
    }

    public void filterBikesByEngineType(String engineType) {
        for (int i = 0; i < bikes.size(); i++) {
            if (engineType != null && bikes.get(i).getEngineType().equals(engineType)) {
                System.out.println(bikes.get(i));
            }
        }
    }
}
