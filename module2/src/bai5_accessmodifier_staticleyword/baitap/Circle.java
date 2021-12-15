package bai5_accessmodifier_staticleyword.baitap;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    private double getRadius() {
        return radius;
    }

    protected double getArea(){
        double area = getRadius() * getRadius();
        return area ;
    }

}
