import java.io.Serializable;

public class TkVoThoiHan extends TkNganHan  {

    public TkVoThoiHan(String maSoSo, KhachHang maKhachHang, String ngayMoSo, String thoiGianBatDauKyGui, int soTienGui, String laiSuat) {
        super(maSoSo, maKhachHang, ngayMoSo, thoiGianBatDauKyGui, soTienGui, laiSuat);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String stringToWrite() {
        return null;
    }
}
