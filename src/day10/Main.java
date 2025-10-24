package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Vehicle car = new Car();

        // System.out.println("nhap thong tin xe");
        // // car.input();
        // // car.display();
        List<Car> cars = new ArrayList<>();
        List<Motorbike> bikes = new ArrayList<>();
        VehicleManager manager = new VehicleManager();
        int choice = 1;
        do {
            System.out.println("==== VEHICLE MANAGEMENT MENU ====");
            System.out.println("1. Input cars");
            System.out.println("2. Input motorbikes");
            System.out.println("3. Display  All cars (sorted by price desc)");
            System.out.println("4. Display motorbikes (filter by engine type)");
            System.out.println("5. Exit");
            System.out.println("nhap lua chon:");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    manager.inputCars(cars);
                    break;

                case 2:
                    manager.inputBikes(bikes);
                    break;
                case 3:
                    manager.displayCarsSortedByPriceDesc();
                    break;
                case 4:
                    System.out.println("nhap loai dong co can tim: ");
                    String engineType = sc.nextLine();
                    manager.filterBikesByEngineType(engineType);
                    break;
                case 5:
                    System.out.println("bye");
                    break;

                default:
                    System.out.println("chi nhap tu 1-5");
                    break;
            }
        } while (choice != 5);

    }
}
