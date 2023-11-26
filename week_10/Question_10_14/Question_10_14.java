package week_10.Question_10_14;

public class Question_10_14 {
    public static void main(String[] args) {
        MyDate myDate=new MyDate();
        MyDate myDate1=new MyDate(34355555133101L);

        System.out.printf("Date1 : %02d/%02d/%d\n",myDate.getDay(),myDate.getMonth(),myDate.getYear());
        System.out.printf("Date2 : %02d/%02d/%d",myDate1.getDay(),myDate1.getMonth(),myDate1.getYear());
    }
}
