package ua.itacadem.Developers;

/**
 * Created by ITEA on 09.12.2014.
 */
public class HR extends Person {
    protected  String department="HR departament: ";

    public HR(String name, double basicSalary, int experience) {
        super(name, basicSalary, experience);
    }
    @Override
    public double getSalary() {
        return basicSalary + (experience > 0 ? basicSalary * experience * 0.5 : 0);
    }
}
