package bai7_abstract_interface.baitap.resizeable_interface;

public class Square extends Shape implements Resizeable {
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
    public double resize(double percent) {
        double area = getArea() +(getArea()* percent);
           return area ;
    }
}
