package week_03;

import java.util.Scanner;

public class Question_03_13 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        double totalTax = 0;

        System.out.print("(0-single filter, 1-married jointly or qualifying widow(er)," +
                " 2-married separately, 3-head of household) Enter the filling status:");
        int status = input.nextInt();

        System.out.print("Enter the taxable income:");
        double income = input.nextDouble();
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
                }break;
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
                }break;
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
                }break;
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
                    totalTax =( first / 10 + ((income - first) * 0.15));
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
                }break;

        }
        System.out.println("Tax is "+totalTax);


    }
}
