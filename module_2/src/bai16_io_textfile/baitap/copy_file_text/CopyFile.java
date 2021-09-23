package bai16_io_textfile.baitap.copy_file_text;

import java.io.*;
import java.util.ArrayList;

public class CopyFile {

    public static ArrayList<String> readFile(String path) {
        ArrayList<String> strings = new ArrayList<>();
        try {
            File file = new File(path);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ;

            while ((line = bufferedReader.readLine()) != null) {
                strings.add(line);
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

    public static void writeFile(String targetPathFile, ArrayList<String> arrayList, Boolean append) {
        try {
            FileWriter fileWriter = new FileWriter(targetPathFile, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String str : arrayList) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
