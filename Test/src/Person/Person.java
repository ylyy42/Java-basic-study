package Person;

public class Person {
	String name;
	int age;
	
	//����Ʈ ������
	public Person() {}
	
	//������
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	// ������
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	void show() {
		System.out.println("��� [ �̸� : " + name + ", ���� : " + age + " ]");
	}
}
