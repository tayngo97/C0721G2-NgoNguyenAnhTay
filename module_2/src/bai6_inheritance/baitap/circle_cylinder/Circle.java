package bai6_inheritance.baitap.circle_cylinder;

public class Circle {
    private double radius = 2.0;
    private String color = "Red";
    private double area = Math.pow(this.radius,2) * Math.PI;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        this.area =  Math.pow(this.radius,2) * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.area = Math.pow(this.radius,2) * Math.PI;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + Math.PI +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
