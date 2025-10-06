package day2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a:");
        int a = sc.nextInt();
        System.out.print("nhap b:");
        int b = sc.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("vo so nghiem");
            } else {
                System.out.println("vo nghiem");
            }
        } else {
            rutGon(a, b);
        }

    }

    public static void rutGon(int a, int b) {
        if (b % a == 0) {
            System.out.print("nghiem la: " + (-b / a));
        } else {
            for (int i = b; i > 0; i--) {
                if (a % i == 0 && b % i == 0) {
                    System.out.print("nghiem la: " + (-b / i) + "/" + (a / i));
                    break;
                }
            }
        }
    }
}
