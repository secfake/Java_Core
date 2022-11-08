package entity;

import constant.SpecializedBookType;

import java.util.Scanner;

public class Book {
    private static int AUTO_ID = 10000;
    private int bookId;
    private String name;
    private String author;
    private String specializedBook;
    private int publishingYear;

    public Book() {
        this.bookId = AUTO_ID;
        AUTO_ID++;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSpecializedBook() {
        return specializedBook;
    }

    public void setSpecializedBook(String specializedBook) {
        this.specializedBook = specializedBook;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public void nhapThongTin() {
        System.out.print("Nhập tên sách: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("Nhập tác giả: ");
        this.author = new Scanner(System.in).nextLine();
        System.out.println("Nhập chuyên ngành: ");
        System.out.println("1. Khoa học tự nhiên");
        System.out.println("2. Văn học - nghệ thuật");
        System.out.println("3. Điện tử viễn thông");
        System.out.println("4. Công nghệ thông tin");
        System.out.print("Vui lòng chọn: ");
        int ch;
        do {
            ch = new Scanner(System.in).nextInt();
            if (ch >= 1 && ch <= 4) {
                break;
            }
            System.out.print("Chọn lại: ");
        } while (true);
        switch (ch) {
            case 1:
                this.specializedBook = SpecializedBookType.NATURAL_SCIEMCES;
                break;
            case 2:
                this.specializedBook = SpecializedBookType.LITERATURE_ART;
                break;
            case 3:
                this.specializedBook = SpecializedBookType.ELECTRONICS_TELECOMMUNICATION;
                break;
            case 4:
                this.specializedBook = SpecializedBookType.INFORMATION_TECHNOLOGY;
                break;
        }
        System.out.print("Nhập năm xuất bản: ");
        this.publishingYear = new Scanner(System.in).nextInt();
    }

    public void inThongTin(){
        System.out.printf("%-8d\t%-20s\t%-20s\t%-24s\t%-15d\n",this.bookId,this.name,this.author,this.specializedBook,this.publishingYear);
    }
}
