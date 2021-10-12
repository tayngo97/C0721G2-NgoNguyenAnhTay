import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyStk quanLySTK = new QuanLyStk();

        boolean flag = true;
        while (flag) {
            System.out.println("1.Them moi STK \n2.Xoa so STK\n3.Xem danh sach STK \n4.Thoat\nNhap so:");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    quanLySTK.themMoiStk();
                    break;
                case "2":
                    quanLySTK.xoaStk();
                    break;
                case "3":
                    quanLySTK.xenDanhSachStk();
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
