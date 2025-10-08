package day3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so can kiem tra:");
        int a = sc.nextInt();
        isPrime(a);

    }

    public static void isPrime(int a) {
        int check = 0;
        if (a < 2) {
            System.out.println("chi nhap so >= 2");
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    check = 1;
                    System.out.println("day khong phai so nguyen to");
                    break;
                }
            }
            if (check == 0) {
                System.out.println("day la so nguyen to");
            }
        }
    }
}
