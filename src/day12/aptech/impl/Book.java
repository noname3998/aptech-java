package day12.aptech.impl;

import java.util.Scanner;

import day12.aptech.data.IDocument;

public class Book implements IDocument {
    private int id;
    private String bookName;
    private String authorName;
    private float price;
    protected Scanner sc = new Scanner(System.in);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Book() {
    }

    public Book(int id, String bookName, String authorName, float price) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        System.out.println("ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("BookName: ");
        bookName = sc.nextLine();
        System.out.println("AuthorName: ");
        authorName = sc.nextLine();
        System.out.println("Price: ");
        price = sc.nextFloat();

    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println(this);

    }

    @Override
    public String toString() {
        return "Id: " + id + "\n" + "BookName: " + bookName + "\n" + "AuthorName: " + authorName + "\n" + "Price: "
                + price;
    }

}
