public class AnimalTest {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		a1.setName("lion");
		a1.setAge(4);
		a2.setName("bear");
		a2.setAge(5);
		a1.eat();
		a1.speak();
		a1.love();
	}
}

class Animal{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	void eat() {
		System.out.println(this.name + "가 맛있는 점심을 먹는다.");
	}
	void speak() {
		System.out.println(this.name + "가 말하고 있는......");
	}
	void love() {
		System.out.println(this.name + "사랑해~~~");
	}
}