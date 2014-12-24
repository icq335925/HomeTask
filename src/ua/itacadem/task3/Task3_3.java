package ua.itacadem.task3;

/**
 * Created by Alex on 26.11.2014.
 *
 * Найти в массиве число,
 * которое повторяется наибольшее количество раз.
 *
 *
 */
public class Task3_3 {
    public static void main(String[] args) {
        int[] mas ={1,5,3,5,5,2,5,5};
        int max=0;
        int A=1;
        for (int i = 0; i <mas.length-1 ; i++) {
            for (int j = i+1; j <mas.length ; j++) {
                if (mas[i] == mas[j]) {
                    max = mas[j];
                    A++;
                }
            }

                if (max == mas[i]) {
                    max = mas[i];
                    A++;
                }
                 else A--;
            }
        System.out.println(max+" - "+A);
        }

    }

