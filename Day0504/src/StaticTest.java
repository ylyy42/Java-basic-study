
public class StaticTest {
	public static void main(String[] args) {
		Child c = new Child();
		Parent.state();
	}
}
class Parent {
	int a, b;
	public static void state() {
		System.out.println("상태값 출력");
	}
	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
}
class Child extends Parent {
	
}