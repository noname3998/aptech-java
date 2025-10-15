package day5.excercise.ex2;

import java.util.ArrayList;

public class User {
    private String userID;
    private String name;
    private ArrayList<Book> borrowedBooks;

    public User(String userID, String name) {
        this.userID = userID;
        this.name = name;
    }

    public String getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrow(Book book) {

    }
}
