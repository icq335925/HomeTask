package ua.itacadem;

/**
 * Created by ITEA on 02.12.2014.
 */
public class Rectang {
    int width, height;

    public Rectang(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int plos() {
        return width*height;
}

    public static void main(String[] args) {
    Rectang d=new Rectang(2,3);
        System.out.println("При ширине "+d.width+" и высоте "+d.height+" площадь равна = "+d.plos());
    }

}
