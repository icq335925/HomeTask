package ua.itacadem.task3;

import java.text.DecimalFormat;
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
        System.out.println("Input math expression (e.g. 1+33-4*7 )");
        String expressionLine = new Scanner(System.in).nextLine();
        expressionLine = expressionLine.trim() + "=";
        StringBuilder buf = new StringBuilder(); // buffer for 1 number (operand)
        double sum = 0; // result of computation
        char op = '+';  // operation that must be applied to accumulated number and 'sum'
        for (int i = 0; i < expressionLine.length(); i++) {
            char c = expressionLine.charAt(i);
            if (('0' <= c) && (c <= '9')) {
                buf.append(c);
            } else {
                int val = Integer.parseInt(buf.toString());
                switch (op) {
                    case '+':
                        sum += val;
                        break;
                    case '-':
                        sum -= val;
                        break;
                    case '*':
                        sum *= val;
                        break;
                    case '/':
                        sum /= val;
                        break;
                    default:
                }
                op = c;
                buf.setLength(0); // clear buffer
            }
        }
        System.out.println(new DecimalFormat().format(sum));
    }
}

