import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

public class Validator {
    protected static   SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    private static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_NumberOfTicket = "^\\d+$";
    public static final String REGEX_ShowTimeId = "^CI-[\\d]{4}$";
    private static Set<Cinema>  cinemas = new TreeSet<>();



    public static String getShowTimeId( ) {
        String input = "";
        boolean flag = true;
        while (flag) {
            input = scanner.nextLine();
            if (Pattern.matches(REGEX_ShowTimeId,input)) {
                System.out.println("------------------");
                flag = false;
            } else {
                System.err.println("Invalid input , please enter : CI-XXXX !");
            }
        }
        return input;
    }



    public static String checkSameFilm(){
          cinemas = CinameToCsv.readDataFromFile();
        String name = "";
        boolean flag = true;
        while (flag){
            flag = false;
            name = scanner.nextLine();
            for (Cinema cinema : cinemas) {
                if (cinema.getFilmName().equals(name)){
                    System.err.println("Invalid,this film already added");
                    flag = true;
                }
            }
        }
        return name;
    }


    public static String getInput(String regex) {
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

    public static String getDate() {
        Calendar cal = Calendar.getInstance();
        String currenTime = dateFormat.format(cal.getTime());
        Date dateNow = null;
        try {
            dateNow = dateFormat.parse(currenTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String input = "";
        Date dateInput = null;
        boolean flag = true;
        while (flag) {
            input = scanner.nextLine();
            try {
                dateInput = dateFormat.parse(input);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (dateNow.before(dateInput)) {
                System.out.println("------------------");
                flag = false;
            } else {
                System.err.println("Invalid input , today is:" + dateNow);
            }
        }
        return input;
    }
}
