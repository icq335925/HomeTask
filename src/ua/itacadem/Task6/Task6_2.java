package ua.itacadem.Task6;

/**
 * Created by Alex on 09.12.2014.
 *
 * Написать иерархию классов «Фигуры». Фигура -> Треугольник, Прямоугольник,Круг.
 * Реализовать ф-ю отрисовкии подсчета площади для каждого типа фигуры.
 */
public class Task6_2 {
    class Figure {
        protected String name;
        public Figure (){
            System.out.println("Фигура");
        }

        public  Figure(String name){
            this.name=name;
        }
        public String getName() {
            return name;
        }
    }
     class Trian extends Figure {
        String name="Tr";
        public double a, b, c;
        double s,p;

        public Trian(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
            p=((a+b+c)*0.5);
            s=p*(p - a)*(p - b)*(p - c);
        }
        public double plos() {
            return Math.sqrt(s);
        }
    }

    public static void main(String[] args)  {
    }
}