package week_10.Question_10_09;

import java.util.Arrays;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length * 2];
            temp = Arrays.copyOf(students, students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (student.equals(students[i])) {
                students[i] = "";
            }
        }
    }

    public void clear() {
        students = new String[100];
    }

    public void displayStudents() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) break;
            if (students[i]=="")continue;
            System.out.println(students[i]);
        }
        System.out.println("-------------------------");
    }
}