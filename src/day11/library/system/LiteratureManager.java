package day11.library.system;

import java.util.ArrayList;
import java.util.Scanner;

import day11.library.literature.LiteraryWork;

public class LiteratureManager {
    protected Scanner sc = new Scanner(System.in);
    private ArrayList<LiteraryWork> literaryWorks;

    public ArrayList<LiteraryWork> getLiteraryWorks() {
        return literaryWorks;
    }

    public void setLiteraryWorks(ArrayList<LiteraryWork> literaryWorks) {
        this.literaryWorks = literaryWorks;
    }

    public LiteratureManager() {
    }

    public LiteratureManager(ArrayList<LiteraryWork> literaryWorks) {
        this.literaryWorks = literaryWorks;
    }

    public void addWork() {
        // System.out.println("nhap so luong sach can them: ");
        // int count = sc.nextInt();
        // sc.nextLine();
        // literaryWorks = new ArrayList<>();
        // for (int i = 0; i < count; i++) {
        // literaryWorks.get(i).inputDetails();
        // }
        System.out.println("Nhap so luong sach can them: ");
        int count = sc.nextInt();
        sc.nextLine();
        if (literaryWorks == null) {
            literaryWorks = new ArrayList<>();
        }
        for (int i = 0; i < count; i++) {
            LiteraryWork work = new LiteraryWork();
            System.out.println("Nhap thong tin sach thu " + (i + 1) + ":");
            work.inputDetails();
            literaryWorks.add(work);
        }
    }

    public void showAllWorks() {
        for (int i = 0; i < literaryWorks.size(); i++) {
            System.out.println("Ten sach: " + literaryWorks.get(i).getTitle());
            System.out.println("Ten tac gia: " + literaryWorks.get(i).getAuthor());
            System.out.println("Nam xuat ban: " + literaryWorks.get(i).getPublicationYear());
            if (literaryWorks.get(i).isClassic()) {
                System.out.println("The work " + literaryWorks.get(i).getTitle() + " is considered a classic");
            } else {
                System.out.println("The work " + literaryWorks.get(i).getTitle() + " is modern");
            }

            System.out.println("So trang: " + literaryWorks.get(i).getPageCount());
        }
    }

    public void findLongestWork() {
        literaryWorks.sort((v1, v2) -> v1.getPageCount() - v2.getPageCount());
        System.out.println(literaryWorks.get(0).getTitle());
    }
}
