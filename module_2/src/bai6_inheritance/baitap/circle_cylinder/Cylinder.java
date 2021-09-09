package bai6_inheritance.baitap.circle_cylinder;

public class Cylinder extends Circle {
    private double chieucao = 5.0;
    public double v = area * this.chieucao  ;

    public Cylinder() {
    }

    public Cylinder(double chieucao) {
        this.chieucao = chieucao;
    }


    public Cylinder(double radius, String color, double chieucao) {
        super(radius, color);
        this.chieucao = chieucao;
    }

    public double getChieucao() {
        return chieucao;
    }

    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }

    public double getV(){
        return v = area * this.chieucao ;
    }

    @Override
    public String toString() {
        return "Cylinder{ with color : " +
                super.color + " with radius : " +super.radius +
                " chieucao= " + chieucao +
                " the tich " + getV() +
                '}';
    }
}
