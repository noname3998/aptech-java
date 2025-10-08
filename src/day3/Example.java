package day3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // for (int i = 1; i < 11; i++) {
        // System.out.println(7 * i);
        // }
        // System.out.println("\n");
        // int sum = 0, count = 0;
        // for (int i = 27; i < 251; i++) {
        // if (i % 3 == 0) {
        // sum = sum + i;
        // count++;
        // }
        // }
        // float avg = (float) (sum / count);
        // System.out.printf("trung binh la %.2f", avg);
        // for (int i = 1; i <= 10; i++) {
        // System.out.println("bang cuu chuong " + i);
        // for (int j = 1; j <= 10; j++) {
        // System.out.printf("%d * %d = %d\n", i, j, i * j);
        // }
        // }
        // System.out.println("nhap so phan tu cua mang:");
        // int n = sc.nextInt();
        // int[] a = new int[n];
        // float count = 0, sum = 0;
        // for (int i = 0; i < a.length; i++) {
        // System.out.printf("phan tu thu %d\n:", i);
        // a[i] = sc.nextInt();
        // }
        // for (int i = 0; i < a.length; i++) {
        // sum = sum + a[i];
        // count++;
        // }
        // for (int i : a) {
        // sum = sum + i;
        // count++;
        // }
        // float avg = sum / count;
        // System.out.printf("trung binh la %.2f", avg);

        String[] a = new String[5];
        for (int i = 0; i < a.length; i++) {
            System.out.printf("nhap ten sinh vien %d:\n", i + 1);
            a[i] = sc.nextLine();
        }
        // Arrays.sort(a);
        // for (int i = 0; i < a.length; i++) {
        // System.out.printf("sinh vien %d: %s\n", i + 1, a[i]);
        // }
        int[] b = new int[5];
        for (int i = 0; i < b.length; i++) {
            System.out.printf("nhap diem cua sinh vien %d:", i + 1);
            b[i] = sc.nextInt();
        }
        Integer[] idx = new Integer[a.length];
        for (int i = 0; i < a.length; i++) {
            idx[i] = i;
        }
        Arrays.sort(idx, (i, j) -> b[j] - b[i]);
        for (int i : idx) {
            System.out.println(a[i] + " - " + b[i]);
        }
    }
}