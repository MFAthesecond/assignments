package week_09.Question_09_02;

import java.util.Scanner;

public class Question_09_02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Stock name: ");
        String name= input.nextLine();
        System.out.print("Stock symbol: ");
        String symbol= input.nextLine();
        Stock newStock=new Stock(name,symbol);

        System.out.println("Price-change percentage: "+newStock.getChangePercent());
    }
}
