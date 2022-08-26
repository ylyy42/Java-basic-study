package person;

public class Person {
	private String name;
	private String schoolName;
	private int grade;
	
	public Person(String name, String schoolName, int grade) {
		this.name = name;
		this.schoolName = schoolName;
		this.grade = grade;
	}
	
	void print() {
		System.out.println("Name : " + name);
		System.out.println("School : " + schoolName);
		System.out.println("Grade : " + grade);
	}
}
