package bai6_inheritance.thuchanh;

public  class Main {
    public static void main(String[] args) {
        // upcasting or dowcasting

        Shape shape = new Circle(); // ngầm định
//        System.out.println(shape instanceof Circle);
        System.out.println( ((Circle)shape).getRadius());

    }
}
