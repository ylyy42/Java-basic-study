package Person;

public class ForeignStudent extends Student {
	String nationality;
	
	// ����Ʈ ������
	public ForeignStudent() {}
	
	// ������
	public ForeignStudent(String name, int age, int number, String nationality) {
		super(name, age, number);
		this.nationality = nationality;
	}
	
	// ������
	public String getNationality() {
		return nationality;
	}

	void show() {
		System.out.println("��� [ �̸� : " + name + ", ���� : " + age + ", ���� : " + number + ", ���� : " + nationality + " ]");
	}

}
