package day12.aptech.data.test;

import java.util.Scanner;

import day12.aptech.manager.DocumentManager;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        DocumentManager dm = new DocumentManager();
        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Add new book.");
            System.out.println("2. Display all books.");
            System.out.println("3. Search books by author name.");
            System.out.println("4. Exit");
            System.out.println("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    dm.addDocument();
                    break;
                case 2:
                    dm.displayAllDocument();
                    break;
                case 3:
                    System.out.println("Nhap ten ta");
                    String authorNameInput = sc.nextLine();
                    dm.searchByAuthorName(authorNameInput);
                    break;
                case 4:
                    System.out.println("Bye.");
                    break;

                default:
                    System.out.println("chi nhap tu 1-4.");
                    break;
            }
        } while (choice != 4);
    }
}
