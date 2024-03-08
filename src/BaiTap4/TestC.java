package BaiTap4;

public class TestC {
    public static void main(String[] args) {
        FictionBook fictionBook = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald", "Scribner");
        NonFictionBook nonFictionBook = new NonFictionBook("Sapiens", "Yuval Noah Harari", "Harper");
        ScienceBook scienceBook = new ScienceBook("Cosmos", "Carl Sagan", "Random House");

        fictionBook.getInfo();
        fictionBook.search();

        nonFictionBook.getInfo();
        nonFictionBook.search();

        scienceBook.getInfo();
        scienceBook.search();
    }

}
