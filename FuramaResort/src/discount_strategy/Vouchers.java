package discount_strategy;

import sun.awt.windows.WPrinterJob;

import javax.swing.*;

public class Vouchers {
    private IVoucherStrategy _iVoucherStrategy;
    private String discount;

    public Vouchers() {
    }

    public Vouchers(IVoucherStrategy iVoucherStrategy) {
        _iVoucherStrategy = iVoucherStrategy;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public IVoucherStrategy getiVoucherStrategy() {
        return _iVoucherStrategy;
    }

    public void setVoucherStrategy(IVoucherStrategy value) {
        this._iVoucherStrategy = value;
    }

    public String getVoucherDiscount() {
        return _iVoucherStrategy.doDiscount();
    }

    @Override
    public String toString() {
        return "Vouchers{" +
                  discount + '\'' +
                '}';
    }
}
