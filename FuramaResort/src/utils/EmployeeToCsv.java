package utils;

import models.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeToCsv {
    public static File file = new File("C:\\C0721G2_NgoNguyenAnhTay\\FuramaResort\\src\\data\\employee.csv");

    public  List<Employee> readDataFromFile() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] employeeList1 = line.split(",");

                employeeList.add(new Employee(employeeList1[0],employeeList1[1], employeeList1[2], Integer.parseInt(employeeList1[3]), Integer.parseInt(employeeList1[4]),
                        employeeList1[5], employeeList1[6], employeeList1[7], employeeList1[8], Integer.parseInt(employeeList1[9])));
            }
            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return employeeList;
    }

    public  void writeToFile(List<Employee> employees) {

        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Employee employee : employees) {
                bw.write(employee.stringToWrite());
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
