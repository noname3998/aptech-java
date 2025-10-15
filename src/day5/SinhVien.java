package day5;

import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private double diemTB;

    public SinhVien() {

    }

    public SinhVien(String hoTen, double diemTB) {
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho va ten:");
        hoTen = sc.nextLine();
        System.out.println("nhap diem trung binh:");
        diemTB = sc.nextDouble();
    }

    public void xuat() {
        System.out.println("ho va ten: " + hoTen);
        System.out.println("diem trung binh: " + diemTB);
        System.out.println("hoc luc: " + hocLuc(diemTB));
    }

    public String hocLuc(double diemTB) {
        if (diemTB >= 9) {
            return "gioi";
        }

        if (diemTB >= 7) {
            return "kha";
        }

        if (diemTB >= 5) {
            return "trung binh";
        }
        return "yeu";
    }
}