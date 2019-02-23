package Task04;

import java.util.Scanner;

class BankOschad {
    public String OSCHAD = "Oschad";
    public String USD = "USD";
    public String EUR = "EUR";
    public String ZLT = "ZLT";
    public String Sell = "SELL";
    public String Buy = "Buy";

    float COURSE_toSell_USD = 27.0f;
    float COURSE_toSell_EUR = 31.0f;
    float COURSE_toSell_ZLT = 7.2f;
    float COURSE_toBuy_USD = 26.5f;
    float COURSE_toBuy_EUR = 30.0f;
    float COURSE_toBuy_ZLT = 6.80f;

    public static void exchangeToBuyOschad() {
        BankOschad bankOschad = new BankOschad();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of money (UAH) that you want to change(BUY): ");
        int amount = scan.nextInt();
        System.out.println("Enter the currency to convert (USD or EUR or ZLT): ");
        String currency = scan.next();

        if (bankOschad.USD.equalsIgnoreCase(currency)) {
            float usd = amount / bankOschad.COURSE_toBuy_USD;
            System.out.println("You got " + usd + " usd");
        } else if (bankOschad.EUR.equalsIgnoreCase(currency)) {
            float eur = amount / bankOschad.COURSE_toBuy_EUR;
            System.out.println("You got " + eur + " eur");
        } else if (bankOschad.ZLT.equalsIgnoreCase(currency)) {
            float zlt = amount / bankOschad.COURSE_toBuy_ZLT;
            System.out.println("You got " + zlt + " zlt ");
        } else System.err.println("Can't convert to " + currency);

    }

    public static void exchangeToSellOschad() {
        BankOschad bankOschad = new BankOschad();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of money that you want to change(SELL): ");
        int amount = scan.nextInt();
        System.out.println("Enter the USD or EUR or ZLT: ");
        String currency = scan.next();

        if (bankOschad.USD.equalsIgnoreCase(currency)) {
            float uah = amount * bankOschad.COURSE_toSell_USD;
            System.out.println("Give  " + uah + " uah");
        } else if (bankOschad.EUR.equalsIgnoreCase(currency)) {
            float uah = amount * bankOschad.COURSE_toSell_EUR;
            System.out.println("Give  " + uah + " uah");
        } else if (bankOschad.ZLT.equalsIgnoreCase(currency)) {
            float uah = amount * bankOschad.COURSE_toSell_ZLT;
            System.out.println("Give  " + uah + " uah");
        } else System.err.println("Can't convert to " + currency);
    }


}
