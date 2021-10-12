import java.io.Serializable;

public abstract class SoTietKiem   {
    private String maSoSo;
    private KhachHang maKhachHang;
    private String ngayMoSo;
    private String thoiGianBatDauKyGui;
    private int soTienGui;
    private String laiSuat;

    public SoTietKiem(String maSoSo, KhachHang maKhachHang, String ngayMoSo, String thoiGianBatDauKyGui, int soTienGui, String laiSuat) {
        this.maSoSo = maSoSo;
        this.maKhachHang = maKhachHang;
        this.ngayMoSo = ngayMoSo;
        this.thoiGianBatDauKyGui = thoiGianBatDauKyGui;
        this.soTienGui = soTienGui;
        this.laiSuat = laiSuat;
    }

    public String getMaSoSo() {
        return maSoSo;
    }

    public void setMaSoSo(String maSoSo) {
        this.maSoSo = maSoSo;
    }

    public KhachHang getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(KhachHang maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getNgayMoSo() {
        return ngayMoSo;
    }

    public void setNgayMoSo(String ngayMoSo) {
        this.ngayMoSo = ngayMoSo;
    }

    public String getThoiGianBatDauKyGui() {
        return thoiGianBatDauKyGui;
    }

    public void setThoiGianBatDauKyGui(String thoiGianBatDauKyGui) {
        this.thoiGianBatDauKyGui = thoiGianBatDauKyGui;
    }

    public int getSoTienGui() {
        return soTienGui;
    }

    public void setSoTienGui(int soTienGui) {
        this.soTienGui = soTienGui;
    }

    public String getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(String laiSuat) {
        this.laiSuat = laiSuat;
    }


    @Override
    public String toString() {
        return "SoTietKiem{" + maKhachHang + "\n"+
                "maSoSo='" + maSoSo +
                ", ngayMoSo='" + ngayMoSo + '\'' +
                ", thoiGianBatDauKyGui='" + thoiGianBatDauKyGui + '\'' +
                ", soTienGui='" + soTienGui + '\'' +
                ", laiSuat='" + laiSuat + '\'' +
                '}';
    }

    public abstract String stringToWrite();
}
