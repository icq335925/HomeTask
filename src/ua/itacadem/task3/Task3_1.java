package ua.itacadem.task3;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by Alex on 26.11.2014.
 *
 * Написать метод для зеркального переворота
 * элементов в массиве ([1, 2, 3, 4, …] -> […, 4, 3, 2, 1]).
 *
 */
public class Task3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Введите " + "[" + (i) + "/" + (arr.length - 1) + "]" + " эллемент массива: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Ваш массив: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mirArray(arr);

    }

        static void mirArray(int[] s) {
            int x;
            int l=s.length;
            for (int i=0; i<l/2; i++){
                x=s[l-1-i];
                s[l-1-i] = s[i];
                s[i]=x;
            }
            String ss = Arrays.toString(s);
            System.out.println("Наш зеркальный массив "+ss);
        }

    }


