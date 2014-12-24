package present10_human;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Date;

/**
 * Created by ITEA on 18.12.2014.
 */
public class Human implements Cloneable {
        enum Pol{
            MALE, FEMALE;
            public Pol getMale(){
                return MALE;
            }
            public Pol getFemale(){
                return FEMALE;
            }
        }
        enum Character implements Externalizable{
            CHARAC ("sanguine", "choleric", "melancholic", "phlegmatic"),;
            String sanguine, choleric, melancholic, phlegmatic;
            Character(String sanguine, String choleric, String melancholic, String phlegmatic) {
                 this.sanguine = sanguine;
                 this.choleric = choleric;
                 this.melancholic = melancholic;
                 this.phlegmatic = phlegmatic;
             }
            private String getSan(){
                return sanguine;
            }
            private String getChol(){
                return choleric;
            }
            private String getMel(){
                return melancholic;
            }
            private String getPhl(){
                return phlegmatic;
            }
        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(sanguine);
            out.writeObject(choleric);
            out.writeObject(melancholic);
            out.writeObject(phlegmatic);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            sanguine = (String)in.readObject();
            choleric = (String)in.readObject();
            melancholic = (String)in.readObject();
            phlegmatic = (String)in.readObject();
        }
    }


    public String name;
    public int age;

    public Date date = new Date();


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return name + ", " + age;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass()) // ДЗ
            return false;
        Human other = (Human) obj;
        return (this.name == other.name) && (this.age == other.age);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Human o = (Human) super.clone();
        o.date = (Date) date.clone();//создаем копию отдельно
        return o;

    }
}
