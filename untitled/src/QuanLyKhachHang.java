import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyKhachHang {
    private static Scanner scanner = new Scanner(System.in);
    private List<KhachHang> khachHangList = new ArrayList<>();

    public static KhachHang themMoiKh(){
        KhachHang khachHang ;
        System.out.println("Nhap ma Kh");
        String maKh = scanner.nextLine();
        System.out.println("Nhap ten Kh");
        String name = scanner.nextLine();
        System.out.println("Nhap ngay sinh Kh");
        String ngaySinh = scanner.nextLine();
        System.out.println("Nhap gioi tinh Kh");
        String gioitinh = scanner.nextLine();
        System.out.println("Nhap sdt Kh");
        String sdtKh = scanner.nextLine();
        System.out.println("Nhap dia chi Kh");
        String diaChi = scanner.nextLine();
         khachHang = new KhachHang(maKh,name,ngaySinh,gioitinh,sdtKh,diaChi);
        return khachHang;
    }
}
