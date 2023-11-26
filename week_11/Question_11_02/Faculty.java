package week_11.Question_11_02;

public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress,
                   String office, int salary, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Faculty() {

    }

    @Override
    public String toString() {
        return "\n     _Faculty_     " +
                "\nName: " + getName() +
                "\nAddress: " + getAddress() +
                "\nPhone Number: " + getPhoneNumber() +
                "\nEmail Address: " + getEmailAddress() +
                "\nOffice: " + getOffice() +
                "\nSalary: " + getSalary() +
                "\nHired Date: " + getDateHired() +
                "\nOffice Hours: " + getOfficeHours() +
                "\nRank: " + getRank();
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
