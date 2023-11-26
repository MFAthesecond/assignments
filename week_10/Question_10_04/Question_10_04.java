package week_10.Question_10_04;

public class Question_10_04 {
    public static void main(String[] args) {
        MyPoint m=new MyPoint(0,0);
        MyPoint m1=new MyPoint(10,30.5);
        System.out.printf("The distance between (%.1f, %.1f) and (%.1f, %.1f) is : %f",m.getX(),m.getY(),m1.getX(),m1.getY(),m.distance(m1));
    }
}
