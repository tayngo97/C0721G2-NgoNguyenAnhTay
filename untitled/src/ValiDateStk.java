import java.util.Scanner;
import java.util.regex.Pattern;

public class ValiDateStk {
    private static Scanner scanner = new Scanner(System.in);
    public  final String REGEX_MASO_STK = "^STK-[0-9]{4}$";
    public  final String REGEX_NGAY = "^([0-9]{2}/){2}[0-9]{4}$";
    public  final String REGEX_KYHAN_NGANHAN = "^3|6$";
    public  final String REGEX_KYHAN_DAIHAN = "^1|3|5|10$";


    public  String kiemTra(String regex) {
        String input = "";
        boolean flag = true;
        while (flag) {
            input = scanner.nextLine();
            if (Pattern.matches(regex,input)) {
                System.out.println("------------------");
                flag = false;
            } else {
                System.err.println("Invalid input , please try again !");
            }
        }
        return input;
    }

    public  int kiemTraSoTienGui() {
        int input = 0;
        boolean flag = true;
        while (flag) {
            input = Integer.parseInt(scanner.nextLine());
            if (input > 1000000) {
                System.out.println("------------------");
                flag = false;
            } else {
                System.err.println("Invalid input , please try again !");
            }
        }
        return input;
    }
}
