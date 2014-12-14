package Student;


import java.util.Date;

public class StudentList {
	private Student[] list = new Student[100];
	private int p = 0;
	
	public void add(Student s) {
		list[p++] = s;
	}


	public Student get(int n) {
		return list[n];
	}

	public Student[] getList() {
		return list;
	}


	public int find(String name) {
		for (int i = 0; i < p; i++) {
			if (list[i].getName().equalsIgnoreCase(name))
				return i;
		}
		
		return -1;
	}
	public int find2(String surname) {
		for (int i = 0; i < p; i++) {
			if (list[i].getSurname().equalsIgnoreCase(surname))
				return i;
		}

		return -1;
	}
	public int find3(Date a) {
		for (int i = 0; i < p; i++) {
			if (list[i].getBirth().equals(a));
		}
		return -1;
	}
	public int dell(String surname) {
		for (int i = 0; i < p; i++) {
			if (list[i].getSurname().equalsIgnoreCase(surname))
				return i--;
		}

		return -1;
	}

	public Student get(Date d) {

		return null;
	}
}
