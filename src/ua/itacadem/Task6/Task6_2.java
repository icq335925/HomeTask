package ua.itacadem.Task6;


/**
 * Created by Alex on 09.12.2014.
 *
 * Написать иерархию классов «Фигуры». Фигура -> Треугольник, Прямоугольник,Круг.
 * Реализовать ф-ю отрисовкии подсчета площади для каждого типа фигуры.
 */


class Figure {
    public String name;
    public double a;

    public Figure(double a, String name) {
        this.name = name;
        this.a = a;
    }

    public String getName() {
        return name;
    }
}
    class Trian extends Figure {
    double c, b, s, p;

    public Trian(double a, double b, double c, String name) {
        super(a,name);
        this.b = b;
        this.c=c;
        p = ((a + b + c) * 0.5);
        s = p * (p - a) * (p - b) * (p - c);
    }

    public double plos() {
        return Math.sqrt(s);
    }
}


    class Circ extends Figure {
        double s;
        double pi = 3.14;

        public Circ(double a, String name) {
            super(a, name);
            s=pi*a*a;
        }
        public double plos() {
            return s;
        }
    }
public class Task6_2 {



    public static void main(String[] args)  {
        Trian t = new Trian(3,3,3, "треугольника");
        Circ circ = new Circ(5, "круга");
        System.out.println("Площадь "+t.getName()+" = "+t.plos());
        System.out.println("Площадь "+circ.getName()+" = "+circ.plos());
    }
}