import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class CinameToCsv {
    private static Scanner scanner = new Scanner(System.in);
    public static File file = new File("C:\\C0721G2_NgoNguyenAnhTay\\baitap\\src\\cinema.csv");
    private static Set<Cinema> cinemas = new TreeSet<>();




    public static Set<Cinema> readDataFromFile() {
        Set<Cinema> employeeList = new TreeSet<>();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] employeeList1 = line.split(",");

                employeeList.add(new Cinema(employeeList1[0],employeeList1[1],employeeList1[2],employeeList1[3]));
            }
            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return employeeList;
    }

    public static   void writeToFile(Set<Cinema> cinema) {

        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Cinema cinema1 : cinema) {
                bw.write(cinema1.stringToWrite());
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
