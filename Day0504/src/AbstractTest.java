abstract class Shape2 {
	public Shape2() {}
	abstract public void draw();
	public void paint() {
		draw();
	}
}
abstract class MyComponent {
	String name;
	public void load(String name) {
		this.name = name;
	}
}
class Circle2 extends Shape2 {

	@Override
	public void draw() {
		System.out.println("Circle2");
	}
}
abstract class Line2 extends Shape2 {
	
}
public class AbstractTest {
	public static void main(String[] args) {
//		Shape2 s = new Shape2();
	}
}
