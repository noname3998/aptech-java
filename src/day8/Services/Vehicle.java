package day8.Services;

import java.util.ArrayList;
import java.util.Scanner;

public class Vehicle {
    protected Scanner sc = new Scanner(System.in);

    private int vehicleNumber;
    private String manufacturer;
    private int yearOfManufacturer;
    private String vehicleColor;
    private Owner owner;
    protected static ArrayList<Vehicle> vehicles = new ArrayList<>();

    public Vehicle(int vehicleNumber, String manufacturer, int yearOfManufacturer, String vehicleColor) {
        this.vehicleNumber = vehicleNumber;
        this.manufacturer = manufacturer;
        this.yearOfManufacturer = yearOfManufacturer;
        this.vehicleColor = vehicleColor;
    }

    public Vehicle() {

    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfManufacturer() {
        return yearOfManufacturer;
    }

    public void setYearOfManufacturer(int yearOfManufacturer) {
        this.yearOfManufacturer = yearOfManufacturer;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void addVehicle() {

        System.out.println("nhap so xe:");
        vehicleNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap nha san xuat:");
        manufacturer = sc.nextLine();
        System.out.println("nhap nam san xuat:");
        yearOfManufacturer = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap mau xe:");
        vehicleColor = sc.nextLine();
        System.out.println("nhap ten chu xe:");
        String name = sc.nextLine();
        System.out.println("nhap email chu so huu:");
        String email = sc.nextLine();
        System.out.println("nhap cmnd:");
        String IdNumber = sc.nextLine();
        owner = new Owner(IdNumber, name, email);

    }

    public static void displayVehicles() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                System.out.println(((Car) vehicle).toString());
            } else if (vehicle instanceof Motorbike) {
                System.out.println(((Motorbike) vehicle).toString());
            } else {
                System.out.println(((Truck) vehicle).toString());
            }
        }
    }

    @Override
    public String toString() {
        return "So xe: " + vehicleNumber + " | Hang san xuat: " + manufacturer + " | Nam san xuat: "
                + yearOfManufacturer
                + " | Mau xe: " + vehicleColor + " | Ten chu so huu: " + owner.getName();
    }

    public static void findVehicleNumber(int vehicleNumber) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleNumber() == vehicleNumber) {
                if (vehicle instanceof Car) {
                    System.out.println(((Car) vehicle).toString());
                } else if (vehicle instanceof Motorbike) {
                    System.out.println(((Motorbike) vehicle).toString());
                } else {
                    System.out.println(((Truck) vehicle).toString());
                }
                break;
            }
        }
    }

    public static void findOwnerIdNumber(String IdNumber) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getOwner().getIdNumber() == IdNumber) {
                if (vehicle instanceof Car) {
                    System.out.println(((Car) vehicle).toString());
                } else if (vehicle instanceof Motorbike) {
                    System.out.println(((Motorbike) vehicle).toString());
                } else {
                    System.out.println(((Truck) vehicle).toString());
                }
                break;
            }
        }
    }

    public static void deleteManufaturer(String manufacturer) {
        vehicles.removeIf(v -> v.manufacturer.equalsIgnoreCase(manufacturer));
    }

    public static void sortVehicleNumber() {
        vehicles.sort((v1, v2) -> v2.getVehicleNumber() - v1.getVehicleNumber());
    }

    public static void maxOfManufaturer() {

    }

}
