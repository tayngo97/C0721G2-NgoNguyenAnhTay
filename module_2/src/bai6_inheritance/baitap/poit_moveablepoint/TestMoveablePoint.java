package bai6_inheritance.baitap.poit_moveablepoint;

public class TestMoveablePoint {
    public static void main(String[] args) {

        Point point = new Point(0,0);
        MovablePoint movablePoint = new MovablePoint(5,6);
        movablePoint.move();
        movablePoint.move();
        movablePoint.move();
        movablePoint.move();
        movablePoint.move();
        System.out.println(movablePoint);

        MovablePoint movablePoint1 = new MovablePoint(0,0,10,6);
        movablePoint1.move();
        movablePoint1.move();
        System.out.println(movablePoint1);
    }
}
