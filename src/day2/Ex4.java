package day2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        do {
            System.out.println("+---------------------------------------------------+");
            System.out.println("1. giai pt bac 1 ");
            System.out.println("2. giai pt bac 2");
            System.out.println("3. tinh tien dien");
            System.out.println("4. ket thuc");
            System.out.println("+---------------------------------------------------+");
            System.out.print("Chon chuc nang: ");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    ptBac1();
                    break;
                case 2:
                    ptBac2();
                    break;
                case 3:
                    tienDien();
                    break;
                case 4:
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("chi nhap tu 1-4.");
            }
        } while (a != 4);
    }

    public static void rutGon(int a, int b) {
        if (b % a == 0) {
            System.out.println("nghiem la: " + (-b / a));
        } else {
            for (int i = b; i > 0; i--) {
                if (a % i == 0 && b % i == 0) {
                    System.out.println("nghiem la: " + (-b / i) + "/" + (a / i));
                    break;
                }
            }
        }
    }

    public static void ptBac1() {
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

    public static void ptBac2() {
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

    public static void tienDien() {
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
