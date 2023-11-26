package week_11.Question_11_06;

import my_projects.Loan;
import my_projects.Circle;

import java.util.ArrayList;
import java.util.Date;
public class Question_11_06 {
    public static void main(String[] args) {
        ArrayList<Object> objectsArrayList = new ArrayList<>();
        objectsArrayList.add(new Date(12345345));
        objectsArrayList.add(new Circle(2));
        objectsArrayList.add(new Loan());

        for (Object o : objectsArrayList) {
            System.out.println( o.toString());
        }
    }
}
