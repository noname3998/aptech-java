package day11.library.literature;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Scanner;

public class LiteraryWork implements ILiteraryWork {
    private String title;
    private String author;
    private int publicationYear;
    private int pageCount;

    public LiteraryWork() {

    }

    public LiteraryWork(String title, String author, int publicationYear, int pageCount) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        // TODO Auto-generated method stub
        if (isClassic()) {
            System.out.println("The work " + title + " is considered a classic");

        } else {
            System.out.println("The work " + title + " is modern");

        }

    }

    @Override
    public void inputDetails() {
        // TODO Auto-generated method stub
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String authorInput = "";
        String titleInput = "";
        int publicationYearInput = 0;
        int pageCountInput = 0;
        do {

            System.out.println("nhap ten tac gia: ");
            try {
                authorInput = br.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } while (authorInput.length() < 3);

        do {
            System.out.println("nhap ten sach: ");
            try {
                titleInput = br.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } while (titleInput.length() < 3);

        // do {
        // System.out.println("nhap nam xuat ban :");
        // try {
        // publicationYearInput = br.read();
        // } catch (IOException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        // } while (publicationYearInput < 1500 || publicationYearInput > 2025);
        publicationYearInput = readInt("Nhap nam xuat ban :", "vui long nhap nam hop le", 1500,
                LocalDate.now().getYear());

        // do {
        // System.out.println("nhap so trang: ");
        // try {
        // pageCountInput = br.read();
        // } catch (IOException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        // } while (pageCountInput < 0);
        pageCountInput = readInt("Nhap so trang: ", "vui long nhap so > 0 ", 0, Integer.MAX_VALUE);

        title = titleInput;
        pageCount = pageCountInput;
        author = authorInput;
        publicationYear = publicationYearInput;
    }

    public boolean isClassic() {
        if (publicationYear < 1970) {
            return true;
        } else {
            return false;
        }
    }

    private int readInt(String prompt, String errorMessage, int min, int max) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print(prompt);

            try {
                String input = br.readLine().trim();
                int number = Integer.parseInt(input);
                if (number >= min && number <= max) {
                    return number;
                } else {
                    System.out.println("Gia tri phai nam trong khoang " + min + " den " + max + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            } catch (IOException e) {
                System.out.println("Loi khi doc du lieu: " + e.getMessage());
            }
        }
    }
}
