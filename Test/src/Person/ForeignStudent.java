package Person;

public class ForeignStudent extends Student {
	String nationality;
	
	// 디폴트 생성자
	public ForeignStudent() {}
	
	// 생성자
	public ForeignStudent(String name, int age, int number, String nationality) {
		super(name, age, number);
		this.nationality = nationality;
	}
	
	// 접근자
	public String getNationality() {
		return nationality;
	}

	void show() {
		System.out.println("사람 [ 이름 : " + name + ", 나이 : " + age + ", 학점 : " + number + ", 국적 : " + nationality + " ]");
	}

}
