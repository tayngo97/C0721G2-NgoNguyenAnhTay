package models.service;

public class Voucher  {
    private String discount;
    public static final String DISCOUNT50 = "discount 50%";
    public static final String DISCOUNT20 = "discount 20%";
    public static final String DISCOUNT10 = "discount 10%";

    public Voucher( String discount) {

        this.discount = discount;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "discount='" + discount + '\'' +
                '}';
    }

    public String voucherToWrite(){
        return getDiscount();
    }

}
