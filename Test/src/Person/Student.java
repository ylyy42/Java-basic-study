package Person;

public class Student extends Person {
	int number;
	
	// 디폴트 생성자
	public Student() {}
	
	// 생성자
	public Student(String name, int age, int number) {
		super(name, age);
		this.number = number;
	}
	
	// 접근자
	public int getNumber() {
		return number;
	}

	void show() {
		System.out.println("사람 [ 이름 : " + name + ", 나이 : " + age + ", 학점 : " + number + " ]");
	}
}
