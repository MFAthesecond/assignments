package week_11.Question_11_02;

public class Question_11_02 {
    public static void main(String[] args) {
        Person person = new Person("cano","silivri","15482354","gafil@gmail.com");
        Student student = new Student("hasan","ankara","56821516","some@afs",0);
        Employee employee = new Employee("recai","istanbul","5+65+65","gmail","15",60000);
        Faculty faculty = new Faculty("sg","texas","646564","asd","iç ofis",456464,"10 am to forever","boss");
        Staff staff = new Staff("elon","dalaware","3216546987","elon@melon","tesla",2321587,"ceo");
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());

    }
}
