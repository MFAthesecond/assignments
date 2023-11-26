package week_06;

import java.util.Scanner;

public class Question_06_15 {
    public static void printHeader() {
        System.out.printf("%-15s%-15s%-20s%-15s%-15s\n", "Taxable", "Single", "Married Joint", "Married", "Head of");
        System.out.printf("%-15s%-15s%-20s%-15s%-15s\n", "Income", "", "or Qualifying", "Separate", "a House");
        System.out.printf("%-15s%-15s%-20s%-15s%-15s\n", "", "", "Widow(er)", "", "");
        System.out.printf("%-75s\n", "------------------------------------------------------------------------");
    }

    public static void printTable() {
        for (int amount = 50000; amount <= 60000; amount += 50) {
            System.out.printf("%-15d%-15.0f%-20.0f%-15.0f%-15.0f\n", amount, computeTax(0, amount), computeTax(1, amount), computeTax(2, amount), computeTax(3, amount));
        }
    }

    public static double computeTax(int status, double income) {
        double totalTax = 0;

        double first = 0;
        double second = 0;
        double third = 0;
        double fourth = 0;
        double fifth = 0;


        switch (status) {
            case 0:
                first = 8350;
                second = 33950;
                third = 82250;
                fourth = 171550;
                fifth = 372950;

                if (income <= first) {
                    totalTax = income / 10;
                }

                if (income <= second && income > first) {
                    totalTax = first / 10 + (income - first) * 0.15;
                }
                if (income <= third && income > second) {
                    totalTax = first / 10 + (second - first) * 0.15 + (income - second) * 0.25;
                }
                if (income <= fourth && income > third) {
                    totalTax = first / 10 + (second - first) * 0.15 + (third - second) * 0.25 +
                            (income - third) * 0.28;
                }
                if (income <= fifth && income > fourth) {
                    totalTax = first / 10 + (second - first) * 0.15 + (third - second) / 4 +
                            (fourth - third) * 0.28 + (income - fourth) * 0.33;
                }
                if (income > fifth) {
                    totalTax = first / 10 + (second - first) * 0.15 + (third - second) * 0.25 +
                            (fourth - third) * 0.28 + (fifth - fourth) * 0.33 + (income - fifth) * 0.35;
                }
                break;
            case 1:
                first = 16700;
                second = 67900;
                third = 137050;
                fourth = 208850;
                fifth = 372950;
                if (income <= first) {
                    totalTax = income / 10;
                }

                if (income <= second && income > first) {
                    totalTax = first / 10 + (income - first) * 0.15;
                }
                if (income <= third && income > second) {
                    totalTax = first / 10 + (second - first) * 0.15 + (income - second) * 0.25;
                }
                if (income <= fourth && income > third) {
                    totalTax = first / 10 + (second - first) * 0.15 + (third - second) * 0.25 +
                            (income - third) * 0.28;
                }
                if (income <= fifth && income > fourth) {
                    totalTax = first / 10 + (second - first) * 0.15 + (third - second) / 4 +
                            (fourth - third) * 0.28 + (income - fourth) * 0.33;
                }
                if (income > fifth) {
                    totalTax = first / 10 + (second - first) * 0.15 + (third - second) * 0.25 +
                            (fourth - third) * 0.28 + (fifth - fourth) * 0.33 + (income - fifth) * 0.35;
                }
                break;
            case 2:
                first = 8350;
                second = 33950;
                third = 68525;
                fourth = 104425;
                fifth = 186475;
                if (income <= first) {
                    totalTax = income / 10;
                }

                if (income <= second && income > first) {
                    totalTax = first / 10 + (income - first) * 0.15;
                }
                if (income <= third && income > second) {
                    totalTax = first / 10 + (second - first) * 0.15 + (income - second) * 0.25;
                }
                if (income <= fourth && income > third) {
                    totalTax = first / 10 + (second - first) * 0.15 + (third - second) * 0.25 +
                            (income - third) * 0.28;
                }
                if (income <= fifth && income > fourth) {
                    totalTax = first / 10 + (second - first) * 0.15 + (third - second) / 4 +
                            (fourth - third) * 0.28 + (income - fourth) * 0.33;
                }
                if (income > fifth) {
                    totalTax = first / 10 + (second - first) * 0.15 + (third - second) * 0.25 +
                            (fourth - third) * 0.28 + (fifth - fourth) * 0.33 + (income - fifth) * 0.35;
                }
                break;
            case 3:
                first = 11950;
                second = 45500;
                third = 117450;
                fourth = 190200;
                fifth = 372950;
                if (income <= first) {
                    totalTax = income / 10;
                }

                if (income <= second && income > first) {
                    totalTax = (first / 10 + ((income - first) * 0.15));
                }
                if (income <= third && income > second) {
                    totalTax = first / 10 + (second - first) * 0.15 + (income - second) * 0.25;
                }
                if (income <= fourth && income > third) {
                    totalTax = first / 10 + (second - first) * 0.15 + (third - second) * 0.25 +
                            (income - third) * 0.28;
                }
                if (income <= fifth && income > fourth) {
                    totalTax = first / 10 + (second - first) * 0.15 + (third - second) / 4 +
                            (fourth - third) * 0.28 + (income - fourth) * 0.33;
                }
                if (income > fifth) {
                    totalTax = first / 10 + (second - first) * 0.15 + (third - second) * 0.25 +
                            (fourth - third) * 0.28 + (fifth - fourth) * 0.33 + (income - fifth) * 0.35;
                }
                break;

        }
        return Math.round(totalTax);
    }

    public static void main(String[] args) {
        printHeader();
        printTable();

    }
}

