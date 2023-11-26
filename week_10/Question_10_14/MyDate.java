package week_10.Question_10_14;

import java.util.Date;

public class MyDate {
    int year;
    int month;
    int day;

    public MyDate() {
        Date today = new Date();
        year = today.getYear();
        month = today.getMonth();
        day = today.getDate();
    }

    public MyDate(long elapasedTime) {
        Date date = new Date(elapasedTime);
        year = date.getYear();
        month = date.getMonth();
        day = date.getDate();
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return  day+"."+month+"."+year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
