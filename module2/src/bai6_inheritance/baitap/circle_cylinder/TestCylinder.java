package bai6_inheritance.baitap.circle_cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.0,"Red",7.0);
        System.out.println(cylinder);
        cylinder.setColor("blue");
        cylinder.setRadius(7.0);
        cylinder.setChieucao(20.0);
        System.out.println(cylinder);
    }
}
