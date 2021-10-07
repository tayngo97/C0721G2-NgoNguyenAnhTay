import java.util.Scanner;

public class CinemaController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CinemaManager cinemaManager = new CinemaManager();
        boolean flag = true;
        while (flag) {
            System.out.println("ABC Cinema \n1.Show list show time\n2.Add new show time\n3.Delete show time\n4.Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    cinemaManager.showListShowTime();
                    break;
                case 2:
                    cinemaManager.addShowTime();
                    break;
                case 3:
                    cinemaManager.deleteShowTime();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
