package Task03.ListBook;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Дан список книг. Книга содержит название, автора и год издания. Необходимо:
        найти самую старую книгу и вывести ее автора;
найти книгу определенного автора и вывести ее название (или названия);
найти книги, изданные ранее введенного года и вывести всю информацию по ним.*/
public class Solution {
    //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        Book[] books = generateBooksArray();
        Book oldestBook = findTheOldestBook(books);
        System.out.println(oldestBook.getAuthor());
        System.out.println(oldestBook.getTitle());
        System.out.println(oldestBook);
        foundBookToAuthor(books, "Пелевин Виктор");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        getBookByYear(books, 2015);

    }

    public static Book[] generateBooksArray() {
        Book[] books = new Book[3];
        Book book0 = new Book("Уотерс Сара", "Дорогие гости", 2000);
        Book book1 = new Book("Пелевин Виктор", "Тайные виды на гору Фудзи", 2017);
        Book book2 = new Book("Сейгер Райли", "Последние Девушки", 2015);
        books[0] = book0;
        books[1] = book1;
        books[2] = book2;

        return books;
    }


    public static Book findTheOldestBook(Book[] books) {
        int minYear = books[0].getYear();
        int indexOfBookWithMinYear = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getYear() < minYear) {
                minYear = books[i].getYear();
                indexOfBookWithMinYear = i;
            }
        }
        return books[indexOfBookWithMinYear];

    }

    public static Book foundBookToAuthor(Book[] ArrayBooks, String author) {
        Book resultbook = new Book();
        for (int i = 0; i < ArrayBooks.length; i++) {
            if (ArrayBooks[i].getAuthor().equals(author)) {
                resultbook = ArrayBooks[i];
                System.out.println(resultbook);
            }
        }

        return resultbook;

    }

    public static Book getBookByYear(Book[] ArrayBooks, int year) {
        Book resultbook = new Book();
        for (int i = 0; i < ArrayBooks.length; i++) {
            if (ArrayBooks[i].getYear() == year) {
                resultbook = ArrayBooks[i];
                System.out.println(resultbook);
            }
        }

        return resultbook;
    }

}


