package week_02;

import java.util.Scanner;

public class Question_02_19 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
       /*
       önce kullanıcıdan her biri iki değerden oluşan üç nokta alacağız
       ve bunları double değişkenlere atayacağız
       s değerini aldığımız noktaları denkleme sokarak hesaplayacağız
       son olarak alanı hesaplayacağız ve çıktı olarak vereceğiz.
        */
        System.out.println("Enter three points for a triangle:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double side3 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));

        double s = ((side1 + side2 + side3) / 2);

        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        System.out.println(area);
        double area1 = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println(area1);

        System.out.println("The area of the triangle is " + area);
        System.out.println("The area of the triangle is " + area1);


    }
}

















