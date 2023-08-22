package week_02.assignments.assignments.nia;

import java.util.Scanner;

public class Question_02_09 {
    public static void main ( String [ ] args){
        Scanner bilal = new Scanner(System.in);
        double x1, x2 , x3, y1, y2, y3 ;
        System.out.println("enter the A point's coordinates ");
        x1 = bilal.nextDouble();
        y1= bilal.nextDouble();
        System.out.println("enter the B point's coordinates");
        x2 = bilal.nextDouble();
        y2= bilal.nextDouble();
        System.out.println("enter the c point's coordinates");
        x3 = bilal.nextDouble();
        y3= bilal.nextDouble();
        System.out.println("                                      .. A( "+x1+" ,"+y1+")");
        System.out.println("                                     .   .");
        System.out.println("                                    .      .");
        System.out.println("    √((x2 - x1)^2 + (y2 - y1)^2)   .         . "+ "/n√((x3 - x1)^2 + (y3 - y1)^2) ");
        System.out.println("                                  .            .");
        System.out.println("                                 .               .");
        System.out.println("                                . . . . . . . . . .");
        System.out.print("                          B("+x3 + ","+y3+")");
        System.out.println("               C("+x3+","+y3+")" );
        System.out.println("                            √((x3 - x2)^2 + (y3 - y2)^2)                       ");
        double side1 = Math.sqrt((Math.pow((x2-x1),2))+Math.pow((y2-y1),2));
        double side2= Math.sqrt((Math.pow((x3-x1),2))+Math.pow((y3-y1),2));
        double side3= Math.sqrt((Math.pow((x3-x2),2))+Math.pow((y3-y2),2));
        double s_total = (side1+side2+side3)/2;
        double area = Math.sqrt(s_total*(s_total-side1)*(s_total-side2)*(s_total-side3));
        System.out.println("area of triangle of A("+x1+"."+y1+")"+"B("+x2+","+y2+")"+"C("+x3+","+y3+") :"+ area);
    }
}