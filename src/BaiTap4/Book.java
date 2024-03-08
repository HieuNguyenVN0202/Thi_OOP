package BaiTap4;

abstract class Book {
    String title;
    String author;
    String publisher;

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public abstract void getInfo();
    public abstract void search();
}
