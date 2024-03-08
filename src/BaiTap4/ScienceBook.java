package BaiTap4;

public class ScienceBook extends Book {
    public ScienceBook(String title, String author, String publisher) {
        super(title, author, publisher);
    }

    @Override
    public void getInfo() {
        System.out.println("Science Book Info:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
    }

    @Override
    public void search() {
        System.out.println("Searching for science books...");
    }
}
