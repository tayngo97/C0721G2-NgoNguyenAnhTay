package bai6_inheritance.baitap.point2d_point3d;

import java.util.Arrays;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(5,6,9);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        point3D.setXYZ(7,9,10);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
