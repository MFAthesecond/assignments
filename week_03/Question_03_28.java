package week_03;

import java.util.Scanner;

public class Question_03_28 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter r1's center x-, y-coordinates, width, and height:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();

        System.out.println("Enter r2's center x-, y-coordinates, width, and height:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();

        double maxHeight1 = y1 + height1;
        double maxHeight2 = y2 + height2;
        double maxwidth1 = x1 + width1;
        double maxwidth2 = x2 + width2;

        double minHeight1 = y1 - height1;
        double minHeight2 = y2 - height2;
        double minwidth1 = x1 - width1;
        double minwidth2 = x2 - width2;


        if ((maxwidth1 > maxwidth2 && minwidth1 < maxwidth2 ) ||  ( maxHeight1 > maxHeight2 && minHeight1 < maxHeight2) || ( minHeight1 < minHeight2 && maxHeight1 > minHeight2) || (minwidth1 < minwidth2 && maxwidth1 > minwidth2)) {
                System.out.println("r2 overlaps r1");
            if (maxwidth1 > maxwidth2 && maxHeight1 > maxHeight2 && minHeight1 < minHeight2 && minwidth1 < minwidth2) {
                System.out.println("r2 is inside r1");
            }
        } else System.out.println("r2 does not overlap r1");
    }
}
//        if (maxwidth1 > maxwidth2 || maxHeight1 > maxHeight2 || minHeight1 < minHeight2 || minwidth1 < minwidth2) {
//            if (minwidth1 < maxwidth2 || minHeight1 < maxHeight2 || maxwidth1 > minwidth2 || maxHeight1 > minHeight2)
//1 2 3 5,5
//Enter r2's center x-, y-coordinates, width, and height:
//3 4 4,5 5

//1 2 3 3
//Enter r2's center x-, y-coordinates, width, and height:
//40 45 3 2