package day5.excercise.ex2;

import java.util.ArrayList;

public class Book {
    private String bookID;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
    }

    public String getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        isBorrowed = true;
    }

    public void returnBook() {
        isBorrowed = false;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (isBorrowed == false) {
            System.out.println("Status: Ready");
        } else {
            System.out.println("Status: Is borrowed");
        }
    }
}
