class Shape {}

class Rectangle extends Shape {}

class Circle2 extends Shape {}

public class CastExceptionTest {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		
		try {
			casting(r);
		} catch (ClassCastException e) {
			System.out.println("타입을 변환할수 없습니다.");
		}
	}

	static void casting(Shape s) throws ClassCastException {
		Circle2 c = (Circle2) s;
	}

}
