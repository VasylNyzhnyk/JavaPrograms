package Task03;

import java.util.Locale;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {

    //init variables
    String USD = "USD";
    String EUR = "EUR";

    float COURSE_USD = 24.5f;
    float COURSE_EUR = 26f;

    //init scanner
    Scanner scan = new Scanner(System.in);

    //enter amount of money
    System.out.println("Enter the amount of money that you want to change: ");
    int amount = scan.nextInt();

    //enter currency
    System.out.println("Enter the currency to convert (USD or EUR): ");
    String currency = scan.next();

    //convert uan to user currency
    if (USD.equalsIgnoreCase(currency)) {
        System.out.println(String.format(Locale.US, "You money in %s: %.2f", USD, amount / COURSE_USD));
    } else if (EUR.equalsIgnoreCase(currency)) {
        System.out.println(String.format(Locale.US, "You money in %s: %.2f", EUR, amount / COURSE_EUR));
    } else {
        System.err.println("Can't convert to " + currency);
    }
}
}

