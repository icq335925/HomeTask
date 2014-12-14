package ua.itacadem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by ITEA on 27.11.2014.
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter");
        String dtStr=sc.nextLine();
        try {
            Date dt=sdf.parse(dtStr);
            System.out.println(dt);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
