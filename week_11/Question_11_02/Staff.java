package week_11.Question_11_02;

public class Staff extends Employee{
 private String title;

    public Staff(String name, String address, String phoneNumber,
                 String emailAddress, String office, int salary, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.title = title;
    }

    public Staff() {
    }
    @Override
    public String toString() {
        return "\n     _Staff_     " +
                "\nName: " + getName() +
                "\nAddress: " + getAddress() +
                "\nPhone Number: " + getPhoneNumber() +
                "\nEmail Address: " + getEmailAddress()  +
                "\nOffice: " + getOffice() +
                "\nSalary: " + getSalary() +
                "\nHired Date: " + getDateHired()+
                "\nTitle: "+getTitle();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
