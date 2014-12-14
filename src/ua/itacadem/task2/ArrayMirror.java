package ua.itacadem.task2;

import java.util.Arrays;

/**
 * Created by ITEA on 25.11.2014.
 */
public class ArrayMirror {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int x;
        String s = Arrays.toString(arr);
        int n=arr.length;
        System.out.println("Наш массив "+s);
        for (int i=0; i<n/2; i++){
            x=arr[n-1-i];
            arr[n-1-i] = arr[i];
            arr[i]=x;
            //  System.out.println(arr[i] + " ");
        }
        String ss = Arrays.toString(arr);
        System.out.println("Наш зеркальный массив "+ss);
    }
}
