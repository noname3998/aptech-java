package day3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang:");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.println("nhap phan tu thu " + (i + 1));
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.printf("phan tu thu %d la: %d\n", i, a[i]);
        }

        System.out.println("phan tu nho nhat co gia tri la " + a[0]);

        float sum = 0, avg = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0) {
                sum += a[i];
                count++;
            }
        }
        avg = sum / count;
        System.out.printf("trung binh cac phan tu chia het cho 3 la: %.2f\n", avg);
    }
}
