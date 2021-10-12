import java.io.Serializable;

public abstract class TkNganHan extends SoTietKiem   {
    public TkNganHan(String maSoSo, KhachHang maKhachHang, String ngayMoSo, String thoiGianBatDauKyGui, int soTienGui, String laiSuat) {
        super(maSoSo, maKhachHang, ngayMoSo, thoiGianBatDauKyGui, soTienGui, laiSuat);
    }
}
