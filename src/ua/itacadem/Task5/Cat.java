package ua.itacadem.Task5;

/**
 * Created by Alex on 03.12.2014.
 */
public class Cat {
    protected String color;
    protected String name;
    static public int count = 0;

    public Cat(String name, String color){
        this.name=name;
        this.color=color;
    }

    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public void voice() {
        System.out.println(" Мяу ");
    }
    public void eat() {
        System.out.println(" Когда я ем я глух и нем.");
    }
    public void play() {
        System.out.println(" Давай поиграем?");
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String name) {
        this.color = color;
    }

    }
