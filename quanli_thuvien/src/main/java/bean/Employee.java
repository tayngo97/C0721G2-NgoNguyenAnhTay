package bean;

public class Employee {
    private String name;
    private int postion;

    public Employee() {
    }

    public Employee(String name, int postion) {
        this.name = name;
        this.postion = postion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPostion() {
        return postion;
    }

    public void setPostion(int postion) {
        this.postion = postion;
    }
}
