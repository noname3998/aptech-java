package day2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so dien da su dung: ");
        int a = sc.nextInt();
        if (a < 50 && a > 0) {
            System.out.print("so tien phai tra la: " + a * 1000);
        } else if (a >= 50) {
            int sum = 50 * 1000 + (a - 50) * 1200;
            System.out.printf("so tien phai tra la: %d", sum);
        } else {
            System.out.println("nhap so lon hon 0");
        }
    }
}
