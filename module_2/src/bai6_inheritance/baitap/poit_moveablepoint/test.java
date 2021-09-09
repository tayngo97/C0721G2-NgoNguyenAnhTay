package bai6_inheritance.baitap.poit_moveablepoint;

import bai6_inheritance.baitap.circle_cylinder.TestCircle;

public class test {
    public static void main(String[] args) {
        Point point = new MovablePoint();
        MovablePoint movablePoint = new MovablePoint();
        TestCircle testCircle = new TestCircle();
        Point point1 = new Point();
        System.out.println(point1.hashCode());
    }
}
