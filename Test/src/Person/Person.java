package Person;

public class Person {
	String name;
	int age;
	
	//디폴트 생성자
	public Person() {}
	
	//생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	// 접근자
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	void show() {
		System.out.println("사람 [ 이름 : " + name + ", 나이 : " + age + " ]");
	}
}
