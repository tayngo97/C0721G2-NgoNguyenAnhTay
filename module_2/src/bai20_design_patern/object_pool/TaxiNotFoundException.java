package bai20_design_patern.object_pool;

public class TaxiNotFoundException  extends  RuntimeException{
    public TaxiNotFoundException(String message) {
        System.out.println(message);
    }
}
