package week_11.Question_11_05;

import java.util.ArrayList;

public class Question_11_05 {
    public static void main(String[] args) {
        var sdet = new Course("SDET");
        sdet.addStudent("nisa");
        sdet.addStudent("sa");
        sdet.addStudent("isa");
        sdet.addStudent("n");
        sdet.addStudent("na");
        ArrayList<String> arrayList = sdet.getStudents();
        System.out.println(sdet.getNumberOfStudents());
        for (int i = 0; i < sdet.getNumberOfStudents(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
