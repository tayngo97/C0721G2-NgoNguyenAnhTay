package bai16_io_textfile.thuchanh.demo;

import java.io.*;
import java.util.Scanner;

public class DemoFile {
    File file;

    public DemoFile(String tenFile) {
        this.file = new File(tenFile);
    }

    public boolean kiemtraThuctThi() {
        return this.file.canExecute();
    }

    public boolean kiemtraDoc() {
        return this.file.canRead();
    }

    public boolean kiemtraGhi() {
        return this.file.canWrite();
    }

    public void inPath() {
        System.out.println(this.file.getAbsolutePath());
    }

    public void inNameFile() {
        System.out.println(this.file.getName());
    }

    public void kiemtraTypeofFile() {
        if (this.file.isDirectory()) {
            System.out.println("La thu muc");
        } else if (this.file.isFile()) {
            System.out.println("La tap tin");
        } else System.out.println("Not found");
    }

    public void inFileCon() {
        if (this.file.isDirectory()) {
            System.out.println("List thu muc con");
            File[] mangcon = this.file.listFiles();
            for (File e : mangcon) {
                System.out.println(e.getAbsolutePath());
            }
        } else System.out.println("Day la tap tin,ko co du~lieu con");
    }

    public void inCayThuMuc() {
        this.inChiTiet(this.file, 1);
    }

    public void inChiTiet(File f, int bac) {
        for (int i = 0; i < bac; i++) {
            System.out.print("\t");
        }
        System.out.print("|__");
        System.out.println(f.getName());
        if (f.canRead()&& f.isDirectory()) {
            File[] mangCon = f.listFiles();
            for (File fx : mangCon) {
                inChiTiet(fx, bac + 1);
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        System.out.println("Nhap ten file");
        String tenFile = scanner.nextLine();
        DemoFile demoFile = new DemoFile(tenFile);
        do {
            System.out.println("Menu--------");
            System.out.println("1.File thuc thi OK");
            System.out.println("2.File doc OK");
            System.out.println("3.File ghi OK");
            System.out.println("4.File duong dan");
            System.out.println("5.In ten File");
            System.out.println("6.File la tap tin hoac thu muc ?");
            System.out.println("7.In ra danh sach file con");
            System.out.println("8.In ra cay thu muc");
            System.out.println("0.Exit ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(demoFile.kiemtraThuctThi());
                    break;
                case 2:
                    System.out.println(demoFile.kiemtraDoc());
                    break;
                case 3:
                    System.out.println(demoFile.kiemtraGhi());
                    break;
                case 4:
                    demoFile.inPath();
                    break;
                case 5:
                    demoFile.inNameFile();
                    break;
                case 6:
                    demoFile.kiemtraTypeofFile();
                case 7:
                    demoFile.inFileCon();
                case 8:
                    demoFile.inCayThuMuc();
                default:
                    break;
            }
        } while (choice != 0);

    }
}

