package bai16_io_textfile.baitap.copy_file_text;

import bai16_io_textfile.baitap.copy_file_text.CopyFile;

import java.util.ArrayList;

public class TestCopyFile {
    public static void main(String[] args) {

        ArrayList<String> strings = CopyFile.readFile("C:\\C0721G2_NgoNguyenAnhTay\\module_2\\data.txt");
        for (String s : strings) {
            System.out.println(s);
        }
        CopyFile.writeFile("C:\\C0721G2_NgoNguyenAnhTay\\module_2\\student_data.txt",strings,false);
    }
}
