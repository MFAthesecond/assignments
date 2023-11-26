package week_09.Question_09_05;

import java.util.GregorianCalendar;

public class Question_09_05 {
    public static void main(String[] args) {
        GregorianCalendar gCal=new GregorianCalendar();
        System.out.println("Current year: "+gCal.get(GregorianCalendar.YEAR));
        System.out.println("Current month: "+gCal.get(GregorianCalendar.MONTH));
        System.out.println("Current day: "+gCal.get(GregorianCalendar.DAY_OF_MONTH));

        GregorianCalendar setGCal=new GregorianCalendar( );
        setGCal.setTimeInMillis(1234567898765L);
        System.out.println("\nAfter setTime: ");
        System.out.println("Current year: "+setGCal.get(GregorianCalendar.YEAR));
        System.out.println("Current month: "+setGCal.get(GregorianCalendar.MONTH));
        System.out.println("Current day: "+setGCal.get(GregorianCalendar.DAY_OF_MONTH));

    }
}
