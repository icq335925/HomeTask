package ua.itacadem.task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Alex on 22.11.2014.
 */
public class Array1 {
        public static void main(String[] args) throws Exception {
            int[] myArray = {4, 2, 9, 5, 1};
            System.out.println("НЕ отсортированый массив: ");
            for(int i = 0; i <  myArray.length; i++) {
                System.out.print(myArray[i] + "  ");
            }
            System.out.println();
            System.out.println("Отсортированый массив: ");
            Arrays.sort(myArray);
            for(int i = 0; i <  myArray.length; i++) {
                System.out.print(myArray[i] + "  ");
            }
            BufferedReader d= new BufferedReader(new InputStreamReader(System.in));
            System.out.println();
            System.out.println("Теперь введем массив с клавиатуры: ");
            int[] myArray2 = new int[5];
            myArray2[0]=Integer.parseInt(d.readLine());
            myArray2[1]=Integer.parseInt(d.readLine());
            myArray2[2]=Integer.parseInt(d.readLine());
            myArray2[3]=Integer.parseInt(d.readLine());
            myArray2[4]=Integer.parseInt(d.readLine());
            System.out.print("Отсортированный массив: ");
            Arrays.sort(myArray2);
            for(int i = 0; i <  myArray2.length; i++) {
                System.out.print(myArray2[i] + "  ");
            }

        }
    }


