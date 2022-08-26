class Shape {}

class Rectangle extends Shape {}

class Circle2 extends Shape {}

public class CastExceptionTest {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		
		try {
			casting(r);
		} catch (ClassCastException e) {
			System.out.println("Ÿ���� ��ȯ�Ҽ� �����ϴ�.");
		}
	}

	static void casting(Shape s) throws ClassCastException {
		Circle2 c = (Circle2) s;
	}

}
