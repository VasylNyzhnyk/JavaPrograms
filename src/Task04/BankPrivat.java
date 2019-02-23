package Task04;

import java.util.Scanner;

public class BankPrivat {
    public String PRIVAT = "Privat";
    public String USD = "USD";
    public String EUR = "EUR";
    public String ZLT = "ZLT";
    public String Sell = "SELL";
    public String Buy = "Buy";

    float COURSE_toSell_USD = 27.2f;
    float COURSE_toSell_EUR = 31.5f;
    float COURSE_toSell_ZLT = 7.40f;
    float COURSE_toBuy_USD = 26.9f;
    float COURSE_toBuy_EUR = 30.5f;
    float COURSE_toBuy_ZLT = 7.05f;

    public static void exchangeToBuyPrivat() {
        BankPrivat bankPrivat = new BankPrivat();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of money (UAH) that you want to change(BUY): ");
        int amount = scan.nextInt();
        System.out.println("Enter the currency to convert (USD or EUR or ZLT): ");
        String currency = scan.next();

        if (bankPrivat.USD.equalsIgnoreCase(currency)) {
            float usd = amount / bankPrivat.COURSE_toBuy_USD;
            System.out.println("You got " + usd + " usd");
        } else if (bankPrivat.EUR.equalsIgnoreCase(currency)) {
            float eur = amount / bankPrivat.COURSE_toBuy_EUR;
            System.out.println("You got " + eur + " eur");
        } else if (bankPrivat.ZLT.equalsIgnoreCase(currency)) {
            float zlt = amount / bankPrivat.COURSE_toBuy_ZLT;
            System.out.println("You got " + zlt + " zlt ");
        } else System.err.println("Can't convert to " + currency);

    }

    public static void exchangeToSellPrivat() {
        BankPrivat bankPrivat = new BankPrivat();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of money that you want to change(SELL): ");
        int amount = scan.nextInt();
        System.out.println("Enter the USD or EUR or ZLT: ");
        String currency = scan.next();

        if (bankPrivat.USD.equalsIgnoreCase(currency)) {
            float uah = amount * bankPrivat.COURSE_toSell_USD;
            System.out.println("Give  " + uah + " uah");
        } else if (bankPrivat.EUR.equalsIgnoreCase(currency)) {
            float uah = amount * bankPrivat.COURSE_toSell_EUR;
            System.out.println("Give  " + uah + " uah");
        } else if (bankPrivat.ZLT.equalsIgnoreCase(currency)) {
            float uah = amount * bankPrivat.COURSE_toSell_ZLT;
            System.out.println("Give  " + uah + " uah");
        } else System.err.println("Can't convert to " + currency);
    }


}
