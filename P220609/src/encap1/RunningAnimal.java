package encap1;

public class RunningAnimal {
	public static void main(String[] args) {
		Animal ani1 = new Animal();
//		ani1.name = "Cat";
		ani1.setName("Cat2");
		ani1.age = 10;
		
		System.out.println(ani1.getName());
		System.out.println(ani1.age);
	}
}

class Animal {
	private String name;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}