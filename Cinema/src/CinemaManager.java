import java.util.*;

public class CinemaManager implements CinemaServices {
    private Scanner scanner = new Scanner(System.in);
    private Set<Cinema> cinemas = new TreeSet<>();

    @Override
    public void showListShowTime() {
        cinemas = CinameToCsv.readDataFromFile();
        for (Cinema cinema : cinemas) {
            System.out.println(cinema);
        }
    }

    @Override
    public void addShowTime() {
        System.out.println("Enter showTimeId");
        String showTimeId = Validator.getShowTimeId();
        System.out.println("Enter filmName");
        String filmName = Validator.checkSameFilm();
        System.out.println("Enter dateToShow");
        String dateToShow = Validator.getDate();
        System.out.println("Enter numberOfTicket");
        String numberOfTicket = Validator.getInput(Validator.REGEX_NumberOfTicket);
        Cinema cinema = new Cinema(showTimeId, filmName, dateToShow, numberOfTicket);

        if (CinameToCsv.file.length()>0){
            cinemas = CinameToCsv.readDataFromFile();
        }
        cinemas.add(cinema);
        CinameToCsv.writeToFile(cinemas);
    }

    @Override
    public void deleteShowTime() {
        cinemas = CinameToCsv.readDataFromFile();
        cinemas.forEach(System.out::println);
        System.out.println("Enter showTimeId to delete :");
        String showTimeId = scanner.nextLine();
        for (Cinema cinema : cinemas) {
            if (cinema.getShowTimeId().equals(showTimeId)) {
                System.out.println("Are you sure to delete this showTimeId  \n1.Yes\n2.No ");
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1) {
                    cinemas.remove(cinema);
                }
            }
            break;
        }
        cinemas.forEach(System.out::println);
        CinameToCsv.writeToFile(cinemas);
    }
}
