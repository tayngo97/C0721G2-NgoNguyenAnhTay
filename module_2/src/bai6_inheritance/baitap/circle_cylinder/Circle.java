package bai6_inheritance.baitap.circle_cylinder;

public class Circle {
    public double radius = 2.0;
    public final double PI = 3.14;
    public String color = "Red";
    public double area = Math.pow(this.radius,2) * PI;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        this.area =  Math.pow(this.radius,2) * PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.area = Math.pow(this.radius,2) * PI;
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
                ", PI=" + PI +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
