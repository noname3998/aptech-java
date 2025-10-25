package day11.library.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = 1;
        Scanner sc = new Scanner(System.in);
        LiteratureManager lm = new LiteratureManager();
        do {
            System.out.println("=== LITERATURE MENU ===");
            System.out.println("1. Add literary work");
            System.out.println("2. Show all works");
            System.out.println("3. Find longest work");
            System.out.println("4. Exit");
            System.out.println("Your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    lm.addWork();
                    System.out.println("them cong viec thanh cong");
                    break;
                case 2:
                    lm.showAllWorks();
                    break;
                case 3:
                    lm.findLongestWork();
                    break;
                case 4:
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("chi nhap tu 1-4");
                    break;
            }
        } while (choice != 4);
    }

    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // String input = "";
    // try {
    // input = br.readLine();
    // } catch (IOException e) {
    // // TODO Auto-generated catch block
    // e.printStackTrace();
    // }
    // System.out.println(Integer.parseInt(input));
}
