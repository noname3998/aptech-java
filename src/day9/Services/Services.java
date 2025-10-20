package day9.Services;

import java.util.Scanner;

public class Services {
    public static void nhap(int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("nhap thong tin nhan vien thu " + (i + 1));
            System.out.println("1. nhan vien hanh chinh");
            System.out.println("2. nhan vien ban hang");
            System.out.println("3. truong phong");
            System.out.print("nhap chuc vu cua nhan vien(1-3): ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                Employee employee = new Employee();
                employee.addEmployee();
            } else if (choice == 2) {
                MarketingStaff ms = new MarketingStaff();
                ms.addEmployee();
            } else if (choice == 3) {
                DepartmentHeads dp = new DepartmentHeads();
                dp.addEmployee();
            } else {
                System.out.println("chi nhap tu 1-3");
                i--;
            }
        }
    }

}
