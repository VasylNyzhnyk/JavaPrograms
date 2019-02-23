package Task03.ListBook;

public class Book {
    public String author;
    public String title;
    public int year;


    public Book() {

    }

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;


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

    public int getYear() {
        return year;
    }

    public void setYear(int yearOfPublis) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Author - " + author +
                ", Title - " + title +
                ", Year  - " + year;
    }
}
