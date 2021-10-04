package bai21_structural_pattern.trienkhai_composite;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        FileComponent file1 = new FileLeaf("file1",10);
        FileComponent file2 = new FileLeaf("file2",5);
        FileComponent file3 = new FileLeaf("file3",15);

        List<FileComponent> files = Arrays.asList(file1,file2,file3);
        FileComponent folder = new FolderComposite(files);
        folder.showProperty();
        System.out.println("Total size " + folder.totalSize());
    }
}
