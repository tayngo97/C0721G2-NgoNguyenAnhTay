package bai16_io_textfile.baitap.read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       ArrayList<Country> countries = ReadFile.readFile("C:\\C0721G2_NgoNguyenAnhTay\\module_2\\src\\countries.csv");
       countries.forEach(System.out::println);
    }
}
