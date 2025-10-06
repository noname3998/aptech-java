package day2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a:");
        int a = sc.nextInt();
        System.out.println("nhap b: ");
        int b = sc.nextInt();
        System.out.println("nhap c:");
        int c = sc.nextInt();
        if (a == 0) {
            rutGon(b, c);
        } else {
            int delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("vo nghiem");
            } else if (delta == 0) {

                rutGon(-b, 2 * a);
            } else {
                System.out.printf("X1 = (" + (-b) + " + sqrt(%d))/" + (2 * a), delta);
                System.out.println("");
                System.out.printf("X2 = (" + (-b) + " - sqrt(%d))/" + (2 * a), delta);

            }
        }

    }

    public static void rutGon(int a, int b) {
        if (b % a == 0) {
            System.out.print("nghiem la X = " + (-b / a));
        } else {
            for (int i = b; i > 0; i--) {
                if (a % i == 0 && b % i == 0) {
                    System.out.print("nghiem la X = " + (-b / i) + "/" + (a / i));
                    break;
                }
            }
        }
    }
}
