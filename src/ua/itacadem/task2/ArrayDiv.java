package ua.itacadem.task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by ITEA on 25.11.2014.
 */
public class ArrayDiv {
    public static void main(String[] args) throws Exception {
        BufferedReader d= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите массив: ");
        int[] arr = new int[6];
        arr[0]=Integer.parseInt(d.readLine());
        arr[1]=Integer.parseInt(d.readLine());
        arr[2]=Integer.parseInt(d.readLine());
        arr[3]=Integer.parseInt(d.readLine());
        arr[4]=Integer.parseInt(d.readLine());
        arr[5]=Integer.parseInt(d.readLine());
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        System.arraycopy(arr, 0, arr1, 0, 3);
        System.arraycopy(arr, 3, arr2, 0, 3);
        Arrays.sort(arr1);
        System.out.print("Отсортируем первую часть массива: ");
        for(int i = 0; i <  arr1.length; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        Arrays.sort(arr2);
        System.out.print("Отсортируем вторую часть массива: ");
        for(int i = 0; i <  arr2.length; i++) {
            System.out.print(arr2[i] + "  ");
        }
    }
}
