package Student;

import java.util.Date;

public class MyClass {

	public static void main(String[] args) {
		StudentList sl = new StudentList();
		
		sl.add(new Student("Seva", "Evgienko", new Date(1986, 1, 1)));
		sl.add(new Student("Vasya", "Pupkin", new Date(1970, 3, 28)));
		sl.add(new Student("Alex", "Post", new Date(1986, 6, 9)));
		sl.add(new Student("Lena", "Post", new Date(1986, 2, 11)));
		
		int n = sl.find("Seva");
		int m = sl.find2("Post");
	//	String d = sl.find3();
		System.out.println(sl.get(n).getBirth().toString());
		System.out.println(sl.get(m).getName());
	//	System.out.println(sl.get(d).getName());
		System.out.println(sl.getList());
		for(int i=0; i<5; i++){
			System.out.println(sl.getList()[i]);
		}
		int z = sl.dell("Post");
		sl.get(z).getSurname();

		for(int i=0; i<5; i++){
			System.out.println(sl.getList()[i]);
		}
	}
}
