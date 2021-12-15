package bai4_oop.baitap;

public class QuadraticEquation {

    public static void main(String[] args) {
        QuadraticEquation result = new QuadraticEquation(1.0,3,1);
        System.out.println(result);
        result.setA(1);
        result.setB(2.0);
        result.setC(1);
        result.getA();
        result.getB();
        result.getC();
        System.out.println(result);
    }

    private double a,b,c;

    public QuadraticEquation(){

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
         double delta = (this.b*2) - (4*this.a*this.c);
        return delta ;
    }

    public double getRoot1() {
        double r1 = 0;
        r1 += ((-this.b + Math.sqrt((this.b * this.b) - (4 * this.a * this.c)))/2*this.a);
        return r1;
    }
    public double getRoot2(){
        double r2 = 0;
        r2 += ( (-this.b - Math.sqrt((this.b * this.b) - (4 * this.a * this.c)) )/2*this.a);
        return r2;
    }

    public String toString(){
          if (getDiscriminant()  > 0){
              return  "2 nghiem cua phuong trinh la " + getRoot1() + "va" + getRoot2();
          } else if (getDiscriminant() == 0){
              double sameRoot = -this.b / 2*this.a ;
             return  " phuong trinh co nghiem kep la :  " + sameRoot;
          } else return " phuong trinh vo nghiem ";
    }
}
