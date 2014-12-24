package ua.itacadem.Task8.t2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Alex on 22.12.2014.
 */


public class FileWrites {
    public static void write(String fileName, String text) throws FileNotFoundException {
        File file = new File(fileName);
        PrintWriter out = new PrintWriter(file.getAbsoluteFile());
        try {
            //Записываем текст в файл
            out.print(text);
        } finally {
            out.close();
        }
    }
}

