package ua.itacadem.task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ITEA on 25.11.2014.
 */
public class ArrayN {
    public static void main(String[] args) throws Exception {
        BufferedReader size= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество элементов массива: ");
        String a = size.readLine();
        int n = Integer.parseInt(a);
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = i;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int x=arr[0];
        arr[0]=arr[n-1];
        arr[n-1]=x;
        System.out.println("Поменял 1 и последний элемент местами: ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
