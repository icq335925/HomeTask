package ua.itacadem.task4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Alex on 03.12.2014.
 *
 * Найти в предложении самое короткое и самое длинное слово.
 *
 */
public class Task4_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader size = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку: ");
        String[] a = size.readLine().split(" ");
        String max=a[0];
        String min=a[0];
        for(int i=0;i<a.length;i++){
                if (a[i].length()>max.length()){
                    max=a[i];
                }
                if (a[i].length()<min.length()){
                min=a[i];
            }
        }
        System.out.println("Самое длинное слово "+"'"+max+"',"+" а самое короткое"+"'"+min+"'");
    }
}
