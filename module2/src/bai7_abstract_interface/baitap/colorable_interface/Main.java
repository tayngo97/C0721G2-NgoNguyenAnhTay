package bai7_abstract_interface.baitap.colorable_interface;

import bai7_abstract_interface.baitap.resizeable_interface.Circle;
import bai7_abstract_interface.baitap.resizeable_interface.Rectangle;
import bai7_abstract_interface.baitap.resizeable_interface.Shape;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square();
        shapes[1] = new Circle();
        shapes[2] = new Rectangle();


        for (Shape shape : shapes){
            if (shape instanceof Colorable){
                Colorable colorable = (Square) shape ;
                     colorable.howToCoLor();
            }else if (shape instanceof Circle){
                System.out.println( "Circle area :" +((Circle)shape).getArea() );
            } else System.out.println( "Rectangle area :" + ((Rectangle)shape).getArea() );
        }
    }
}
