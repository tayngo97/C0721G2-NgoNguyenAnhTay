import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyStk implements IQuanLyStk {
    private ValiDateStk kiemTra = new ValiDateStk();
    private List<SoTietKiem> soTietKiems = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);


    @Override
    public void themMoiStk() {
        System.out.println("1.Them moi STK dai han \n2.Them moi STK ngan han");
        String choice = scanner.nextLine();
        while (Integer.parseInt(choice) >=3){
            System.out.println("Nhập từ 1-2,nhập lại");
            choice = scanner.nextLine();
        }

        System.out.println("Nhap mã số sổ");
        String maSoSTK = kiemTra.kiemTra(kiemTra.REGEX_MASO_STK);
        System.out.println("Nhap thong tinkhách hàng");
        KhachHang maKH = QuanLyKhachHang.themMoiKh();
        System.out.println("Nhap ngày mở sổ");
        String ngayMoSo = kiemTra.kiemTra(kiemTra.REGEX_NGAY);
        System.out.println("Nhap thời gian bắt đầu gửi");
        String thoiGianGui = kiemTra.kiemTra(kiemTra.REGEX_NGAY);
        System.out.println("Nhap số tiền gửi");
        int soTienGui = kiemTra.kiemTraSoTienGui();
        System.out.println("Nhap số lãi suất");
        String laiSuat = scanner.nextLine();

        switch (choice) {
            case "1":
                System.out.println("nhập kỳ hạn");
                String kyhan = kiemTra.kiemTra(kiemTra.REGEX_KYHAN_DAIHAN);
                System.out.println("nhập ưu đãi");
                String uudai = scanner.nextLine();
                TkDaiHan tkDaiHan = new TkDaiHan(maSoSTK, maKH, ngayMoSo, thoiGianGui, soTienGui, laiSuat, kyhan, uudai);
                soTietKiems.add(tkDaiHan);
                break;
            case "2":
                System.out.println("1.Them moi STK vo thoi han\n2.Them moi STK co thoi han");
                String choice1 = scanner.nextLine();
                switch (choice1) {
                    case "1":
                        TkVoThoiHan tkVoThoiHan = new TkVoThoiHan(maSoSTK, maKH, ngayMoSo, thoiGianGui, soTienGui, laiSuat);
                        soTietKiems.add(tkVoThoiHan);
                        break;
                    case "2":
                        System.out.println("nhập kỳ hạn");
                        String kyhan1 = kiemTra.kiemTra(kiemTra.REGEX_KYHAN_NGANHAN);
                        TkCoThoiHan tkCoThoiHan = new TkCoThoiHan(maSoSTK, maKH, ngayMoSo, thoiGianGui, soTienGui, laiSuat, kyhan1);
                        soTietKiems.add(tkCoThoiHan);
                        break;
                    default:
                        System.out.println("Invalid input");
                }
            default:
                System.out.println("Invalid input");
        }
    }

    @Override
    public void xoaStk() {
        System.out.println("Nhập vào mã STK");
        String maSTk = scanner.nextLine();
        for (int i=0;i < soTietKiems.size() ;i++) {
            if (soTietKiems.get(i).getMaSoSo().equals(maSTk)){
                System.out.println("Bạn có muốn xóa không ? \n1.Yes\n2.No");
                String choice = scanner.nextLine();
                if (choice.contains("1")){
                    soTietKiems.remove(soTietKiems.get(i));
                    System.out.println("Deleted");
                }
            }
        }
    }

    @Override
    public void xenDanhSachStk() {
        for (SoTietKiem soTietKiem:soTietKiems) {
            System.out.println(soTietKiem);
        }
    }
}
