package week_11.Question_11_02;

import java.util.Date;

public class Employee extends Person {
    private String office;
    private int salary;
    private Date dateHired;

    public Employee(String name, String address, String phoneNumber,
                    String emailAddress, String office, int salary) {
        super(name, address, phoneNumber, emailAddress);
        dateHired = new Date();
        this.office = office;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\n     _Employee_     " +
                "\nName: " + getName() +
                "\nAddress: " + getAddress() +
                "\nPhone Number: " + getPhoneNumber() +
                "\nEmail Address: " + getEmailAddress()  +
                "\nOffice: " + getOffice() +
                "\nSalary: " + getSalary() +
                "\nHired Date: " + getDateHired();
    }

    public Employee() {
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDateHired() {
        return dateHired.toLocaleString();
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }
}
