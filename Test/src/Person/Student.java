package Person;

public class Student extends Person {
	int number;
	
	// ����Ʈ ������
	public Student() {}
	
	// ������
	public Student(String name, int age, int number) {
		super(name, age);
		this.number = number;
	}
	
	// ������
	public int getNumber() {
		return number;
	}

	void show() {
		System.out.println("��� [ �̸� : " + name + ", ���� : " + age + ", ���� : " + number + " ]");
	}
}
