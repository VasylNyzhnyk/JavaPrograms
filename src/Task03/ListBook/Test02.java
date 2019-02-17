package Task03.ListBook;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.time.Year;
import java.util.concurrent.BrokenBarrierException;

/*Дан список книг. Книга содержит название, автора и год издания. Необходимо:
        найти самую старую книгу и вывести ее автора;
найти книгу определенного автора и вывести ее название (или названия);
найти книги, изданные ранее введенного года и вывести всю информацию по ним.*/
public class Test02 {
    //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        addBooks();
        getAuthors("Уотерс Сара");


    }

    public static void addBooks() {
        ListBook book1 = new ListBook("Уотерс Сара", "Дорогие гости", 2018);
        ListBook book2 = new ListBook("Пелевин Виктор", "Тайные виды на гору Фудзи", 2017);
        ListBook book3 = new ListBook("Сейгер Райли", "Последние Девушки", 2019);

        System.out.println("_____________________________________________________________________________");
        System.out.println(book1);
        System.out.println("_____________________________________________________________________________");
        System.out.println(book2);
        System.out.println("_____________________________________________________________________________");
        System.out.println(book3);
        System.out.println("_____________________________________________________________________________");


    }

    public static void getAuthors(String author) {
        ListBook book = new ListBook();
        book.getAuthor();
        System.out.println(book.getAuthor());
    }

    public static void getYear(int year){
        ListBook book = new ListBook();
        book.getYearOfPublis();


    }
}


