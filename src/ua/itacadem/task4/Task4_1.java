package ua.itacadem.task4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * Created by Alex on 03.12.2014.
 * Найти все уникальные (не повторяющиеся) элементы массива.
 */
public class Task4_1 {
    public static void main(String[] args) throws Exception {

        BufferedReader size = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите массив символов: ");
        String a = size.readLine();
        char[] m=a.toCharArray();
        int sum=1;
        for (int i=0; i<m.length-1; i++){
            if (m[0]!=m[i]){
                sum++;
            }
        }
        System.out.println("В массиве "+sum+" уникальных символов");
    }
}
