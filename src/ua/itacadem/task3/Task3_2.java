package ua.itacadem.task3;

import java.util.Scanner;

/**
 * Created by Alex on 26.11.2014.
 *
 * Написать метод, который заполнит массив
 * произвольного размера числами по возрастанию,
 * начиная с центра массива, например, [5,4,3,2,1,0,1,2,3,4,5].
 *
 */
public class Task3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        array(arr);

    }
    static void array(int[] s) {
        for (int i=0; i<s.length; i++) {
            if(i<s.length/2){
                s[i]=(s.length/2)-i;
                System.out.print(s[i] + " ");
            }
            else {
                s[i]=(i-s.length/2);
                System.out.print(s[i] + " ");
            }
        }
    }



}
