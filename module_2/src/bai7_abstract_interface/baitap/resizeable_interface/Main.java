package bai7_abstract_interface.baitap.resizeable_interface;

import bai7_abstract_interface.baitap.resizeable_interface.Shape;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();

        System.out.println("Before change size :");
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Circle : " + ((Circle) shape).getArea());
            } else if (shape instanceof Rectangle) {
                System.out.println("Rectangle : " + ((Rectangle) shape).getArea());
            } else System.out.println(" Square : " + ((Square) shape).getArea());
        }

        System.out.println("------------------------------------------");
        System.out.println("After change size : ");
        for (Shape shape1 : shapes) {
            double percen = (Math.random() * 100)/100;
            if (shape1 instanceof Circle) {
                System.out.println( ((Circle) shape1).resize(percen) );
            } else if (shape1 instanceof Rectangle) {
                System.out.println( ((Rectangle) shape1).resize(percen) );
            } else System.out.println( ((Square) shape1).resize(percen) );
        }
    }
}

