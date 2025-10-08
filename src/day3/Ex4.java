package day3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so sinh vien:");
        int n = sc.nextInt();
        float[] b = new float[n];
        String[] a = new String[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("nhap ten sinh vien " + (i + 1) + ":");
            a[i] = sc.nextLine();

            System.out.println("nhap diem sinh vien " + (i + 1) + ":");
            b[i] = sc.nextFloat();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.printf("sinh vien %s - " + "diem tb %.2f - " + "hoc luc %s\n", a[i], b[i], HocLuc(b[i]));
        }

        System.out.println("\nSap xep danh sach sv theo thu tu diem tang dan:");

        Integer[] idx = new Integer[n];
        for (int i = 0; i < idx.length; i++) {
            idx[i] = i;
        }

        Arrays.sort(idx, (i, j) -> Float.compare(b[i], b[j]));

        for (int i : idx) {
            System.out.println(a[i] + " - " + b[i]);
        }
    }

    public static String HocLuc(float a) {
        if (a < 5) {
            return "yeu";
        } else if (a >= 5 && a < 6.5) {
            return "trung binh";
        } else if (a >= 6.5 && a < 7.5) {
            return "kha";
        } else if (a >= 7.5 && a < 9) {
            return "gioi";
        } else {
            return "xuat sac";
        }
    }
}
