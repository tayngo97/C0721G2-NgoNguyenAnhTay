package bai5_accessmodifier_staticleyword.baitap;

public class Test {
    public static void main(String[] args) {
        Student student1= new Student();
        student1.setName("Steven"); // private nên ko truy cap khac class được
        student1.setClasses("CO4");
        System.out.println(student1.getName() + " hoc lop " + student1.getClasses());
    }
}
