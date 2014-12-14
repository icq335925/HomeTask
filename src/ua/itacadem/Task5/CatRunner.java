package ua.itacadem.Task5;

/**
 *
 * Описать класс «Cat» (в качестве образца можно взять домашнего питомца).
 * Наделить его свойствами и методами. Создать несколько экземпляров объектов этого класса.
 * Использовать эти объекты.
 * Created by Alex on 03.12.2014.
 */
public class CatRunner {
    public static void main(String[] args) {
        Cat cat1=new Cat("Васька","белый");
        Cat cat2=new Cat("Мурзик","коричневый");
        System.out.println("Наш кот "+cat1.name+" "+cat1.color);
        System.out.println("Наш кот "+cat2.name+" "+cat2.color);
        cat1.setName("Мурка");
        System.out.println("Теперь у Васьки имя "+cat1.name);
        System.out.print(cat1.name);
        cat1.eat();
        System.out.print(cat2.name);
        cat2.play();


    }
    }
