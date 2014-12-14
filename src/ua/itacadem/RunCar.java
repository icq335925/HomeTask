package ua.itacadem;

/**
 * Created by ITEA on 02.12.2014.
 */
public class RunCar {
    public static void main(String[] args) {
    Car a=new Car();
        System.out.println(a.run());
        System.out.println(a.go());
        System.out.println(a.speed(60));
        System.out.println(a.stop());
    }
}
