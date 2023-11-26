package week_11.Question_11_02;

public class Student extends Person {
    private int status;

    public Student() {

    }

    public Student(String name, String address, String phoneNumber, String emailAddress, int status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "\n     _Student_     " +
                "\nName: " + getName() +
                "\nAddress: " + getAddress() +
                "\nPhone Number: " + getPhoneNumber() +
                "\nEmail Address: " + getEmailAddress() +
                "\nClass Status: " + getStatus();
    }
}
