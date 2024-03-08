package BaiTap4;

public class NonFictionBook extends Book {
    public NonFictionBook(String title, String author, String publisher) {
        super(title, author, publisher);
    }

    @Override
    public void getInfo() {
        System.out.println("Non-Fiction Book Info:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
    }

    @Override
    public void search() {
        System.out.println("Searching for non-fiction books...");
    }
}
