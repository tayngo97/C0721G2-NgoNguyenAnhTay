package bai6_inheritance.baitap.circle_cylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(3.0,"Blue");
        System.out.println(circle1);
        circle1.setRadius(4.0);
        System.out.println(circle1);
    }
}
