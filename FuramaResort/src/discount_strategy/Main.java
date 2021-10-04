package discount_strategy;

import models.service.Voucher;

public class Main {
    public static void main(String[] args) {
        Vouchers voucher = new Vouchers();
        voucher.setVoucherStrategy(new Discount50());
        voucher.setVoucherStrategy(new Discount20());
        voucher.setVoucherStrategy(new Discount10());
        System.out.println(voucher.getVoucherDiscount());
    }
}
