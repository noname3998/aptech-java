package day10;

import java.util.Scanner;

public class Car extends Vehicle {
    private int seatCount;
    private String brand;

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return super.getId();
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }

    @Override
    public double getPrice() {
        // TODO Auto-generated method stub
        return super.getPrice();
    }

    @Override
    public int getYear() {
        // TODO Auto-generated method stub
        return super.getYear();
    }

    @Override
    public void setId(String id) {
        // TODO Auto-generated method stub
        super.setId(id);
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        super.setName(name);
    }

    @Override
    public void setPrice(double price) {
        // TODO Auto-generated method stub
        super.setPrice(price);
    }

    @Override
    public void setYear(int year) {
        // TODO Auto-generated method stub
        super.setYear(year);
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    // string id, string name,
    // int year,
    // double price,
    // int seatcount, String brand

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
        System.out.println("nhap so cho ngoi: ");
        seatCount = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap hang xe: ");
        brand = sc.nextLine();
    }

    @Override
    public String toString() {
        return "So xe: " + id + "\n" + "Ten xe: " + name + "\n" + "Nam san xuat: " + year + "\n" + "Gia tien: " + price
                + "\n" + "So cho ngoi: " + seatCount + "\n" + "Thuong hieu: " + brand + "\n";
    }

    public Car() {

    }

    public Car(String id, String name, int year, double price, int seatCount, String brand) {
        super(id, name, year, price);
        this.seatCount = seatCount;
        this.brand = brand;
    }

}
