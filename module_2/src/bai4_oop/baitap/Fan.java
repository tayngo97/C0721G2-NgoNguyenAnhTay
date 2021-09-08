package bai4_oop.baitap;

public class  Fan {
    final static int FAST = 3 ;
    final static int MEDIUM = 2 ;
    final static int SLOW = 1 ;
    private int speed = this.SLOW;
    private boolean on = false ;
    private double radius = 5 ;
    private String color = "blue";

    public Fan(){
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        if (isOn()){
            return   " Fan is on speed is :  " + this.getSpeed() + " color : " + this.getColor() + " radius :  " + this.getRadius();
        } else return  " Fan is off Color :  " + this.getColor() + " radius ";
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(FAST,true,10,"Yellow");
        System.out.println(fan1);
        fan1.setOn(false);
        fan1.toString();
        fan1.setOn(true);
        fan1.toString();

        Fan fan2 = new Fan(MEDIUM,false,5,"blue");
        fan2.toString();
    }
}


