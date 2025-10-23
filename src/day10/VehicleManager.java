package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleManager {
    public List<Car> cars = new ArrayList<>();
    public List<Motorbike> bikes = new ArrayList<>();
    protected Scanner sc = new Scanner(System.in);

    public void inputCars(List<Car> cars) {

        System.out.println("nhap so luong xe: ");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("xe thu " + i);
            cars.get(i).input();
        }
    }

    public void inputBikes(List<Motorbike> bikes) {

        System.out.println("nhap so luong xe: ");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("xe thu " + i);
            bikes.get(i).input();
        }
    }

    public void displayCarsSortedByPriceDesc() {
        cars.sort((v1, v2) -> Double.compare(v1.getPrice(), v2.getPrice()));
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("--- thong tin xe thu " + i + " la ---");
            cars.get(i).display();
        }
    }

    public void filterBikesByEngineType(String engineType) {
        for (int i = 0; i < bikes.size(); i++) {
            if (bikes.get(i).getEngineType() == engineType) {

            }
        }
    }
}
