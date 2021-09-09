package bai6_inheritance.baitap.poit_moveablepoint;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed ,float ySpeed){
        this.xSpeed =xSpeed;
        this.ySpeed =ySpeed;
    }

    public float[] getSpeed(){
        float[] arr = {this.xSpeed,this.ySpeed};
        return arr;
    }

    public MovablePoint move(){
          setX(getY())  += getxSpeed();
         setY(getY())  += getySpeed();
        return this;
    } // nhờ a Tiến chỉ lại chỗ ni e tìm ko ra lỗi.thanks a nhé

    @Override
    public String toString() {
        return "MovablePoint{" + Arrays.toString(getXY()) +
                " speed = " + Arrays.toString(getSpeed()) +
                '}';
    }
}
