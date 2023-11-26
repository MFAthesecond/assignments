package week_10.Question_10_09;

public class Question_10_09 {
    public static void main(String[] args) {
        Course course = new Course("SDET");
        course.addStudent("ahmet");
        course.addStudent("mehmet");
        course.addStudent("burak");
        course.displayStudents();
        course.dropStudent("ahmet");
        course.displayStudents();
        course.clear();
        course.displayStudents();
    }
}
