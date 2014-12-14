package ua.itacadem.Task5;

/**
 * Created by Администратор on 06.12.2014.
 *
 * Описать класс «Vector3D» (т.е. он должен описывать вектор в 3-х мерной,
 * декартовой системе координат). В качестве свойств этого класса возьмите
 * координаты вектора. Для этого класса реализовать методы сложения,
 * и скалярного и векторного произведения векторов.
 * Создайте несколько объектов этого класса и протестируйте их.
 */
public class Vector3D {
    private double x,y,z;
    public Vector3D(double x, double y, double z){
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }
    public Vector3D(Vector3D v){
        this.setX(v.getX());
        this.setY(v.getY());
        this.setZ(v.getZ());
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public Vector3D sumVector(Vector3D v){
        return new Vector3D(getX() + v.getX(), getY() + v.getY(), getZ() + v.getZ());
    }
    public Vector3D miltVector(Vector3D v){
        return new Vector3D(getX() * v.getX(), getY() * v.getY(), getZ() * v.getZ());
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Vector [x=");
        builder.append(x);
        builder.append(", y=");
        builder.append(y);
        builder.append(", z=");
        builder.append(z);
        builder.append("]");
        return builder.toString();
    }
    public static void main(String[] args) {
        Vector3D v1 = new Vector3D(2,3,1);
        Vector3D v2 = new Vector3D(1,2,2);
        System.out.println(v1.sumVector(v2));
        System.out.println(v2.miltVector(v1));
    }

}
