package Task04;


import java.util.Scanner;

import static Task04.BankOschad.exchangeToBuyOschad;
import static Task04.BankOschad.exchangeToSellOschad;
import static Task04.BankPUMB.exchangeToBuyPumb;
import static Task04.BankPUMB.exchangeToSellPumb;
import static Task04.BankPrivat.exchangeToBuyPrivat;
import static Task04.BankPrivat.exchangeToSellPrivat;

/*
2.1. На ее основе необходимо сделать программу для конвертации гривны
в доллар по одному из заранее известных (значения задаются в переменных/константах/моделях)
 курсов (например, курс приватБанка, ОщадБанка, и банка ПУМБ). Название банка вводится с консоли.
2.2* На её основе необходимо сделать программу для конвертации
трёх валют (например доллар, евро, рубль) в трёх разных банках (например, курс приватБанка,
ОщадБанка, и банка ПУМБ). Возможные курсы валют и имена банков заранее известны. Название банка
и валюты для конвертации вводятся с консоли.
2.3** На её основе сделать программу для конвертации трёх валют в трёх разных банках по двум
 курсам: покупка и продажа. Возможные курсы валют и имена банков известны заранее. Название банка
 , валюты и операции (покупка/продажа) для конвертации вводятся с консоли.

*/
public class Solution {
    public static void main(String[] args) {
        switchBank();

    }

    public static void switchBank() {
        Scanner scan = new Scanner(System.in);
        BankPrivat bankPrivat = new BankPrivat();
        BankPUMB bankPUMB = new BankPUMB();
        BankOschad bankOschad = new BankOschad();
        System.out.println("Enter name Bank: (Privat or PUMB or Oschad)  ");
        String nameOfbank = scan.next();
        if (bankPrivat.PRIVAT.equalsIgnoreCase(nameOfbank)) {
            exchangeToBuyPrivat();
            exchangeToSellPrivat();
        } else if (bankPUMB.PUMB.equalsIgnoreCase(nameOfbank)) {
            exchangeToBuyPumb();
            exchangeToSellPumb();
        } else if (bankOschad.OSCHAD.equalsIgnoreCase(nameOfbank)) {
            exchangeToSellOschad();
            exchangeToBuyOschad();
        } else System.out.println("Invalid bank name ");
    }


}
