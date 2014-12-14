package ua.itacadem.Developers;


public class Developer extends Person {

    protected  String department="IT departament: ";
	
	public Developer(String name, double basicSalary, int experience) {
		super(name, basicSalary, experience);
	}

    @Override
    public double getSalary() {
        return basicSalary + (experience > 0 ? basicSalary * experience : 0);
    }
}

