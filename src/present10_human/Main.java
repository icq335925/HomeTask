package present10_human;

/**
 * Created by ITEA on 18.12.2014.
 */
public class Main {
    public static void main(String[] args) {
        Human h1 = new Human ("Alex", 18);
        Human h2 = new Human ("Bonya", 5);
        Human h3 = new Human ("Alex", 18);
        System.out.println("----------ENUM------------");
        System.out.println(h1+", ("+Human.Pol.FEMALE+")"+", character - "+Human.Character.CHARAC.choleric);

        System.out.println("----------to String------------");
        System.out.println(h1);

        System.out.println("----------Clone------------");
        try {
            Human h4 = new Human ("Ira", 25);
            Human h5 = (Human) h1.clone();
            System.out.println(h4.name+" = "+ h5.name);
        }catch (CloneNotSupportedException e){
            System.out.println("error");
        }
        System.out.println("-----------HasCode-----------");

        int hc1=h1.hashCode();
        int hc2=h2.hashCode();
        System.out.println(hc1+", "+hc2);

        System.out.println("----------Equals------------");

        boolean e1 = h1.equals(h3);
        boolean e2 = h1.equals(h2);
        System.out.println("h1 equals h3 "+e1);
        System.out.println("h1 equals h2 "+e2);

    }
}
