package ua.itacadem;

/**
 * Created by ITEA on 02.12.2014.
 */
public class Car {

    public String run(){
        return "Машина завелась";
    }
    public String stop(){
        return "Заглушили двигатель";
    }
    public String go(){
        return "Машина едет";
    }
    public String speed(int x){
       return "едем со скоростью "+ x+" m/s";
    }


}