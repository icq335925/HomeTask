package ua.itacadem.task2;

import java.util.Arrays;

/**
 * Created by ITEA on 25.11.2014.
 */
public class ArrayMid {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 5, 1};
        String s = Arrays.toString(arr);
        System.out.println("Наш массив "+s);
        int sum = 0;
        for(int i = 0; i <  arr.length; i++) {
            sum += arr[i];
        }
        int  l = arr.length;
        double a = sum/l;
        System.out.println("Сумма элементов массива = "+sum);
        System.out.println("Длинна массива = "+arr.length);
        System.out.println("Среднее арефметическое массива = "+a);
    }
}
