package Task03.ListBook;

public class ListBook {
   public static String author;
    public static String title;

    public static int yearOfPublis;

    @Override
    public String toString() {
        return "Author - " + author +
                ", Title - " + title  +
                ", Year  - " + yearOfPublis;
    }

    public ListBook() {

    }

    public ListBook(String author, String title, int yearOfPublis) {
        this.author = author;
        this.title = title;
        this.yearOfPublis = yearOfPublis;


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

    public int getYearOfPublis() {
        return yearOfPublis;
    }

    public void setYearOfPublis(int yearOfPublis) {
        this.yearOfPublis = yearOfPublis;
    }
}
