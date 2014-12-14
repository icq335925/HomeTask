package Exaption;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ITEA on 09.12.2014.
 */
public class Zadanie1 {
    public static void main(String[] args)throws Exception {
        BufferedReader size= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку: ");
        String a = size.readLine();
        String[] str = a.split("&");
        String[] mas = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            mas[i] = String.valueOf(str[i]);
            System.out.println(mas[i]);
        }
    }
}
