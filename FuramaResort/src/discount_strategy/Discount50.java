package discount_strategy;

public class Discount50 implements IVoucherStrategy{
    @Override
    public String doDiscount() {
        return "Voucher discount 50%";
    }
}
