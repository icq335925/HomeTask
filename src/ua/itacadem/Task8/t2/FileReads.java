package ua.itacadem.Task8.t2;

import java.io.*;

/**
 * Created by Alex on 22.12.2014.

public class FileReads {
    public static String read(String fileName) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }


}
 */