package BaiTap4;

public class FictionBook extends Book {
    public FictionBook(String title, String author, String publisher) {
        super(title, author, publisher);
    }

    @Override
    public void getInfo() {
        System.out.println("Fiction Book Info:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
    }

    @Override
    public void search() {
        System.out.println("Searching for fiction books...");
    }
}
