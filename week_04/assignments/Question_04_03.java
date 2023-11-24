package week_04.assignments;

import java.util.Scanner;

public class Question_04_03 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        double atlanta_x = Math.toRadians(33.7489954);
        double atlanta_y = Math.toRadians(-84.3879824);

        double orlando_x = Math.toRadians(28.5383355);
        double orlando_y = Math.toRadians(-81.3792364999);

        double savannah_x = Math.toRadians(32.0835407);
        double savannah_y = Math.toRadians(-81.09983419999998);

        double charlotte_x = Math.toRadians(35.2270869);
        double charlotte_y = Math.toRadians(-80.84312669999997);

        double radius = 6371.01;

        double a = radius * Math.acos(Math.sin(savannah_x) * Math.sin(orlando_x) + Math.cos(savannah_x)
                * Math.cos(orlando_x) * Math.cos(savannah_y - orlando_y));

        double d = radius * Math.acos(Math.sin(charlotte_x) * Math.sin(savannah_x) +
                Math.cos(charlotte_x) * Math.cos(savannah_x) * Math.cos(charlotte_y - savannah_y));

        double c = radius * Math.acos(Math.sin(atlanta_x) * Math.sin(charlotte_x)
                + Math.cos(atlanta_x) * Math.cos(charlotte_x) * Math.cos(atlanta_y - charlotte_y));

        double b = radius * Math.acos(Math.sin(orlando_x) * Math.sin(atlanta_x)
                + Math.cos(orlando_x) * Math.cos(atlanta_x) * Math.cos(orlando_y - atlanta_y));

        double e = radius * Math.acos(Math.sin(savannah_x) * Math.sin(atlanta_x)
                + Math.cos(savannah_x) * Math.cos(atlanta_x) * Math.cos(savannah_y - atlanta_y));


        double s1 = (e + b + a) / 2;
        double s2 = (e + c + d) / 2;

        double area1 = Math.sqrt(s1 * (s1 - e) * (s1 - a) * (s1 - b));
        double area2 = Math.sqrt(s2 * (s2 - e) * (s2 - c) * (s2 - d));


        System.out.println(area1);
        System.out.println(area2);

        System.out.println("Estimated area enclosed by these four cities:" + (area1 + area2));
    }
}
