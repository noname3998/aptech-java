package day10;

import java.util.Scanner;

public class Motorbike extends Vehicle {
    private String engineType;
    private double weight;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Motorbike() {

    }

    public Motorbike(String id, String name, int year, double price, String engineType, double weight) {
        super(id, name, year, price);
        this.engineType = engineType;
        this.weight = weight;

    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so xe: ");
        id = sc.nextLine();
        System.out.println("nhap ten xe: ");
        name = sc.nextLine();
        System.out.println("nhap nam san xuat: ");
        year = sc.nextInt();
        System.out.println("nhap gia xe: ");
        price = sc.nextDouble();
        sc.nextLine();
        System.out.println("nhap loai dong co: ");
        engineType = sc.nextLine();
        System.out.println("nhap trong luong: ");
        weight = sc.nextDouble();
    }

    @Override
    public void display() {

        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "So xe: " + id + "\n" + "Ten xe: " + name + "\n" + "Nam san xuat: " + year + "\n" + "Gia tien: " + price
                + "\n" + "Loai dong co: " + engineType + "\n" + "Trong luong: " + weight + "\n";
    }
}
