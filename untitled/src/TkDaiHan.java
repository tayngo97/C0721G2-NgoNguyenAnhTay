import java.io.Serializable;

public class TkDaiHan extends SoTietKiem  {
   private String kyHan;
   private String uuDai;
   public static final String YEAR = "1 nam";
   public static final String YEAR3 = "3 nam";
   public static final String YEAR5 = "5 nam";
   public static final String YEAR10 = "10nam";

    public TkDaiHan(String maSoSo, KhachHang maKhachHang, String ngayMoSo, String thoiGianBatDauKyGui, int soTienGui, String laiSuat, String kyHan, String uuDai) {
        super(maSoSo, maKhachHang, ngayMoSo, thoiGianBatDauKyGui, soTienGui, laiSuat);
        this.kyHan = kyHan;
        this.uuDai = uuDai;
    }

    public String getKyHan() {
        return kyHan;
    }

    public void setKyHan(String kyHan) {
        this.kyHan = kyHan;
    }

    public String getUuDai() {
        return uuDai;
    }

    public void setUuDai(String uuDai) {
        this.uuDai = uuDai;
    }

    @Override
    public String toString() {
        return "TkDaiHan{" + getMaKhachHang() +
                "kyHan='" + kyHan + '\'' +
                ", uuDai='" + uuDai + '\'' +
                "} " + super.toString();
    }

    @Override
    public String stringToWrite() {
        return getMaSoSo() + "," + getMaKhachHang().stringToWrite() + "," + getNgayMoSo()
                + "," + getThoiGianBatDauKyGui()+ "," + getSoTienGui()+ "," + getLaiSuat()+ "," + getKyHan()+ "," + getUuDai() ;
    }
}
