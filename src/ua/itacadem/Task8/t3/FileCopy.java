package ua.itacadem.Task8.t3;

/*
* Написать программу для копирования всех файлов
* из одного каталога в другой.
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws Exception {
        String a = "F://Work//src//ua//itacadem//Task8//1";
        String b = "F://Work//src//ua//itacadem//Task8//2";
        CopyFiles.scannerDir(a, b);
    }

    public static class CopyFiles {

        public static void copyFile(File src, File dest) throws IOException {
            byte buffer[] = new byte[100000000];
            try {
                FileInputStream fileIn = new FileInputStream(src);
                int bytes = fileIn.read(buffer, 0, 100000000);
                fileIn.close();

                FileOutputStream fileOut = new FileOutputStream(dest);
                fileOut.write(buffer, 0, bytes);
                fileOut.close();
            } catch (Exception e) {

            }
        }

        public static void scannerDir(String dir1, String dir2) throws Exception {
            File[] list = new File(dir1).listFiles();
            for (int i = 0; i < list.length; i++) {
                File f1 = new File(dir1 + "//" + list[i].getName());
                File f2 = new File(dir2 + "//" + list[i].getName());
                CopyFiles.copyFile(f1, f2);
            }
        }

    }
}




