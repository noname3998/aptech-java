package day12.aptech.manager;

import java.util.ArrayList;
import java.util.Scanner;

import day12.aptech.impl.Book;

public class DocumentManager {
    ArrayList<Book> documents;
    protected Scanner sc = new Scanner(System.in);

    public ArrayList<Book> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<Book> documents) {
        this.documents = documents;
    }

    public DocumentManager() {
    }

    public DocumentManager(ArrayList<Book> documents) {
        this.documents = documents;
    }

    public void addDocument() {
        System.out.println("Amount of books: ");
        int amount = sc.nextInt();
        documents = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            Book book = new Book();
            book.input();
            documents.add(book);
        }
        System.out.println("Add books successfully");
    }

    public void displayAllDocument() {
        for (int i = 0; i < documents.size(); i++) {
            System.out.println("Thong tin quyen sach thu " + (i + 1));
            documents.get(i).show();
        }
    }

    public void searchByAuthorName(String authorName) {
        int count = 0;
        for (int i = 0; i < documents.size(); i++) {
            if (documents.get(i).getAuthorName().equals(authorName)) {
                documents.get(i).show();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Khong co quyen sach nao cua tac gia [ " + authorName + " ]");
        }
    }
}
