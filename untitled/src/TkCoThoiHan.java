import java.io.Serializable;

public class TkCoThoiHan extends TkNganHan   {
    private String kyHan;
    public static final String MONTH6 = "6 thang";
    public static final String MONTH3 = "3 thang";

    public TkCoThoiHan(String maSoSo, KhachHang maKhachHang, String ngayMoSo, String thoiGianBatDauKyGui, int soTienGui, String laiSuat, String kyHan) {
        super(maSoSo, maKhachHang, ngayMoSo, thoiGianBatDauKyGui, soTienGui, laiSuat);
        this.kyHan = kyHan;
    }

    public String getKyHan() {
        return kyHan;
    }

    public void setKyHan(String kyHan) {
        this.kyHan = kyHan;
    }

    @Override
    public String toString() {
        return "TkCoThoiHan{" + getMaKhachHang() +
                "kyHan='" + kyHan + '\'' +
                "} " + super.toString();
    }

    @Override
    public String stringToWrite() {
        return null;
    }
}
