package discount_strategy;

public class Discount20 implements IVoucherStrategy {
    @Override
    public String doDiscount() {
        return "Voucher discount 20 %";
    }
}
