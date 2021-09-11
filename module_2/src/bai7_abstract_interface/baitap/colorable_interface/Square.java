package bai7_abstract_interface.baitap.colorable_interface;

import bai7_abstract_interface.baitap.resizeable_interface.Shape;

public class Square extends Rectangle implements Colorable  {
    private double size = 5.0 ;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getArea (){
        return this.size*this.size;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSize()
                + " with area is "
                + getArea();
    }

    @Override
    public void howToCoLor() {
        System.out.println("Color all four sides");
    }
}
