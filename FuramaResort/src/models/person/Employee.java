package models;

public class Employee  extends Person{
    private String staffID;
    private String level;
    private String position;
    private  int salary;
    private final static String INTERMEDIATE = "intermediate";
    private final static String COLLEGE = "college";
    private final static String UNIVERSITY = "university";
    private final static String AFFTERUNIVERSITY = "afferuniversity";

    private final static String RECEPTION = "reception";
    private final static String WAITERS = "waiters";
    private final static String EXPERT = "expert";
    private final static String SUPERVIOR = "supervisor";
    private final static String MANAGER = "manager";
    private final static String GM = "General Manager";

    public Employee(String name, int birthday, String gender, int CMND, int phoneNumber, String email, String staffID, String level, String position, int salary) {
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

    public static void main(String[] args) {
        Employee employee = new Employee("Nam",1990,"Male",1990,11,"Amel","aa",AFFTERUNIVERSITY,GM,30000);
    }
}
