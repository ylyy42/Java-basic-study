package Person;

public class PersonTest {

	public static void main(String[] args) {
		Person[] p = new Person[3];
		p[0] = new Person("�浿��", 22);
		p[1] = new Student("Ȳ����", 23, 100);
		p[2] = new ForeignStudent("Amy", 30, 200, "U.S.A");
		
		for(Person arr : p) {
			arr.show();
		}
	}

}
