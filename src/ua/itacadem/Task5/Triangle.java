package ua.itacadem.Task5;

/**
 * Created by Alex on 03.12.2014.
 *
 * Описать класс «Triangle». В качестве свойств возьмите длинны сторон треугольника.
 * Реализуйте метод который будет возвращать площадь этого треугольника.
 * Создайте несколько объектов этого класса и протестируйте их.
 *
 */
public class Triangle {
       public double a, b, c;
        double s,p;

        public Triangle(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
            p=((a+b+c)*0.5);
             s=p*(p - a)*(p - b)*(p - c);
        }

        public double plos() {
            return Math.sqrt(s);
        }

        public static void main(String[] args) {
            Triangle d=new Triangle(2.0,3.0,2.0);
            System.out.println("Сторона А = "+d.a+" сторона В = "+d.b+" сторона С = "+d.c+" Площадь равна = "+d.plos()+" p= ");
        }

    }


