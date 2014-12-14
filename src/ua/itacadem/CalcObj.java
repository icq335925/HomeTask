package ua.itacadem;

/**
 * Created by ITEA on 02.12.2014.
 */
public class CalcObj {
    static int sum=0;
    public  CalcObj(){
    sum++;

}
    public static void main(String[] args) {
        CalcObj a=new CalcObj();
        CalcObj b=new CalcObj();
        CalcObj c=new CalcObj();
        System.out.println(sum);
    }
}
