package discount_strategy;

public class Discount10 implements IVoucherStrategy{
    @Override
    public String doDiscount() {
        return "Voucher discount 10%";
    }
}
