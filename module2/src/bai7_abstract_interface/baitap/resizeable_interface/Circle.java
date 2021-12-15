package bai7_abstract_interface.baitap.resizeable_interface;

public class Circle  extends Shape implements Resizeable{
    private double radius = 5.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = radius * radius * Math.PI;
        return area;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public double resize(double percent) {
        double area  = getArea() + (getArea() * percent) ;
        return area ;
    }
}
