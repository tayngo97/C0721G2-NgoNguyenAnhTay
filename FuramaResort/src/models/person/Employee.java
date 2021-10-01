package models.person;

import java.io.Serializable;

public class Employee  extends Person   {
    private String staffID;
    private String level;
    private String position;
    private  int salary;

    public final static String INTERMEDIATE = "intermediate";
    public final static String COLLEGE = "college";
    public final static String UNIVERSITY = "university";
    public final static String AFFTERUNIVERSITY = "afferuniversity";

    public final static String RECEPTION = "reception";
    public final static String WAITERS = "waiters";
    public final static String EXPERT = "expert";
    public final static String SUPERVIOR = "supervisor";
    public final static String MANAGER = "manager";
    public final static String GM = "General Manager";

    public Employee(String name, String birthday, String gender, int CMND, int phoneNumber, String email, String staffID, String level, String position, int salary) {
        super(name, birthday, gender, CMND, phoneNumber, email);
        this.staffID = staffID;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                 super.toString() +
                "staffID='" + staffID + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary + "}";
    }

    public String stringToWrite(){
        return getName() + "," + getBirthday() + "," + getGender()+ "," + getCMND() +"," + getPhoneNumber()
                + "," + getEmail() +"," + getStaffID() +"," + getLevel() +"," + getPosition() + "," + getSalary();
    }

}
