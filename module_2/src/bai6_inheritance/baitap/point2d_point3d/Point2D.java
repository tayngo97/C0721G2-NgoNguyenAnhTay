package bai6_inheritance.baitap.point2d_point3d;

import java.util.Arrays;

public class Point2D {
    private float x ;
    private float y ;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
       float[] arr = new float[2] ;
       arr[0] = getX();
       arr[1] = getY();
        return arr; // [5.0,6.0]
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + getX() +
                ", y=" + getY() +
                " " +
                '}';
    }
}
