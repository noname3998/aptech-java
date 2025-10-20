package day9;

import java.util.Scanner;

import day9.Services.Employee;
import day9.Services.Services;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 1;
        do {
            System.out.println("=========================================================");

            System.out.println("1. Nhap danh sach nhan vien");
            System.out.println("2. Xuat danh sach nhan vien");
            System.out.println("3. Tim va hien thi nhan vien theo ma nhan vien");
            System.out.println("4. Xoa nhan vien theo ma nhan vien");
            System.out.println("5. Cap nhat thong tin nhan vien theo ma nhan vien");
            System.out.println("6. Tim cac nhan vien theo khoang luong");
            System.out.println("7. Sap xep danh sach nhan vien theo ho va ten");
            System.out.println("8. Sap xep nhan vien theo thu nhap");
            System.out.println("9. Xuat 5 nhan vien co thu nhap cao nhat");
            System.out.println("10. Thoat chuong trinh");

            System.out.println("=========================================================");
            System.out.println("nhap lua chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("nhap so luong nhan vien can them: ");
                    int number = sc.nextInt();
                    try {
                        Services.nhap(number);
                        System.out.println("nhap thong tin nhan vien thanh cong");

                    } catch (Exception e) {
                        System.out.println("nhap that bai: " + e.getMessage());
                    }
                    break;
                case 2:
                    Employee.displayEmployee();
                    break;
                case 3:
                    System.out.println("nhap ma nhan vien can tim: ");
                    String idNumber = sc.nextLine();
                    Employee.findEmployeeByIdNumber(idNumber);
                    break;
                case 4:
                    System.out.println("nhap ma nhan vien can xoa thong tin: ");
                    String idNumberDelete = sc.nextLine();
                    Employee.deleteEmployeeByIdNumber(idNumberDelete);
                    break;
                case 5:
                    System.out.println("nhap ma nhan vien can cap nhat thong tin: ");
                    String idNumberUpdate = sc.nextLine();
                    Employee.updateEmployeeByIdNumber(idNumberUpdate);
                    break;
                case 6:
                    System.out.println("nhap gioi han trai: ");
                    double leftLimit = sc.nextDouble();
                    System.out.println("nhap gioi han phai: ");
                    double rightLimit = sc.nextDouble();
                    Employee.findEmployeeBySalary(leftLimit, rightLimit);
                    break;
                case 7:
                    Employee.sortByName();
                    Employee.displayEmployee();
                    break;
                case 8:
                    Employee.sortBySalary();
                    Employee.displayEmployee();
                    break;
                case 9:
                    Employee.displayFiveEmployee();
                    break;
                case 10:
                    System.out.println("Bye");
                    break;

                default:
                    System.out.println("chi nhap tu 1-10");
                    break;
            }
        } while (choice != 10);
    }
}
