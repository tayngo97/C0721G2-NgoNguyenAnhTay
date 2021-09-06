package bai5_accessmodifier_staticleyword.thuchanh;

public class TestStaticMethod {
    public static void main(String args[]) {
//        Student.change(); //calling change method

        //creating objects
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");
        s1.change();
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
