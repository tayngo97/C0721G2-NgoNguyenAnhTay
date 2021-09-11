package bai7_abstract_interface.baitap.colorable_interface;

import bai7_abstract_interface.baitap.resizeable_interface.Resizeable;
import bai7_abstract_interface.baitap.resizeable_interface.Shape;

public class Rectangle extends Shape implements Resizeable {
    private double width = 5.0;
    private double length = 7.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public double resize(double percent) {
        double area =  getArea() +(getArea() * percent);
        return area ;
    }
}
