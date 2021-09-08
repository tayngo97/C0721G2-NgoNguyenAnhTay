package bai6_inheritance.thuchanh;

public class Circle  extends Shape{
    private double radius = 1.0 ;

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
}
