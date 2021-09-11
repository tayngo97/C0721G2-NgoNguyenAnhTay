package Anomynusclass;

public class Main {
    public static void main(String[] args) {
        Anomynus anomunus = new Anomynus() {
            @Override
            public void hello() {
                System.out.println("Hello");
            }
        };

        anomunus.hello();

        Xinchao xinchao = new Xinchao() {
            @Override
            public void xinChao() {
                super.xinChao();
            }
        };

        xinchao.xinChao();
    }
}

abstract class Xinchao{
    public void xinChao(){
        System.out.println("Xin chao");
    }
}
