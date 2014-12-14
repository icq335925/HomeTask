package ua.itacadem.Task6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Alex on 08.12.2014.
 *
 * Написать программу в стиле ООП, которая будет рисовать на консоли прямоугольник с заданными длинами сторон.
 */
public class Task6_1 {



    protected Task6_1() {

    }

     protected void storonaA(int a){
         while (a > 0) {
             System.out.print("--");
             a--;
         }
         System.out.println();
    }
    protected void storonaB(int b,int c){
        while (c>0){

        String [] mass = new String[b];
        mass[0]="|";
        mass[b-1]="|";
        System.out.print(mass[0]);
        for(int i=0; i<mass.length-1; i++){
            mass[i]="  ";
            System.out.print(mass[i]);
        }
        System.out.println(mass[b - 1]);
            c--;
        }
    }


    public static void main(String[] args)  throws Exception {
        BufferedReader size= new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Введите ширину прямоугольника: ");
        String w = size.readLine();
        int width = Integer.parseInt(w);

       System.out.print("Введите высоту прямоугольника: ");
        String h = size.readLine();
       int height = Integer.parseInt(h);
        Task6_1 m = new Task6_1();

        m.storonaA(width);
        m.storonaB(width,height);
        m.storonaA(width);



    }
}

