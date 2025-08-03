package csc142;

public class PersonUser {
	//main: Entry point of the program
	public static void main(String[] persona) {
		// instantiate the Person class
		new PersonUser();
		bar();
		
	}
	public static Person foo(int b, Person p) {
		//p.changeName("Sophia");
		p = new Person ("Sophia1", 25);
		p.changeName("Sophia");
		b += 2;
		return p;
	}
	public static void bar() {
		int a = 3;
		Person q = new Person ("Suzy", 25);
		foo(a,q);
		System.out.println("a =" + a + ", name = "+q.getName());
		
	}
}
