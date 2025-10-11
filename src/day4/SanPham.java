package day4;

import java.util.Scanner;

public class SanPham {
    private String tenSP;
    private double donGia;
    private double giamGia;

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSP, double donGia) {
        this(tenSP, donGia, 0);
    }

    public SanPham() {

    }

    // public static void main(String[] args) {
    // SanPham sp = new SanPham();
    // sp.nhap();
    // sp.xuat();

    // }

    public void xuat() {
        System.out.println("ten san pham: " + tenSP);
        System.out.println("don gia: " + donGia);
        System.out.println("giam gia: " + giamGia + "%");
        System.out.printf("thue nhap khau: %.2f\n", getThueNhapKhau());

    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap ten san pham:");
        tenSP = sc.nextLine();
        System.out.println("nhap don gia:");
        donGia = sc.nextDouble();
        System.out.println("nhap % giam gia:");
        giamGia = sc.nextDouble();
        sc.nextLine();
    }

    public double getThueNhapKhau() {
        return (donGia / 10);
    }
}
