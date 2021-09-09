package bai6_inheritance.baitap.point2d_point3d;

import java.util.Arrays;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(5,6);
        System.out.println(Arrays.toString(point2D.getXY()));
        point2D.setXY(7,9);
        System.out.println(Arrays.toString(point2D.getXY()));

    }
}
