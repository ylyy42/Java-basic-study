package Vehicle;

public class Car extends Vehicle {
	int displacement;
	int gears;
	
	// ����Ʈ ������
	public Car() {}
	
	// ������
	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}
	
	void show() {
		System.out.println("�ڵ��� ���� : " + color);
		System.out.println("�ڵ��� �ӵ� : " + speed);
		System.out.println("�ڵ��� ��ⷮ : " + displacement);
		System.out.println("�ڵ��� ��� �ܼ� : " + gears);
	}
}
