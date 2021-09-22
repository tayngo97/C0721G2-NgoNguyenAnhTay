package ManagerOfficerSystem;

public class Worker  extends Offiicer{
    private int lever ;

    public Worker(String name, int age, String gender, String address,int lever) {
        super(name, age, gender, address);
        this.lever = lever ;
    }

    public int getLever() {
        return lever;
    }

    public void setLever(int lever) {
        this.lever = lever;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "lever=" + lever +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
