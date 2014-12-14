package ua.itacadem.task3;

import java.util.Scanner;

/**
 * Created by Alex on 26.11.2014.
 *
 * С помощью консоли пользователь вводит
 * математическое выражение типа “1+33-4*7”.
 * Написать программу для подсчета его значения.
 * Приоритет операций не учитывается.
 *
 */
public class Task3_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение для подсчета: ");
        String n = sc.nextLine();
        //char[] mass=n.toCharArray();
int a=0;
        for (int i = 0; i < n.length(); i++) {
            if(!(n.charAt(i)=='+'||n.charAt(i)=='-'||n.charAt(i)=='*'||n.charAt(i)=='/')) {
                a= Integer.valueOf(n.charAt(i));
                a++;
            }
            System.out.print(n.charAt(i));
            }
        System.out.println(a);
        }

}

