package Vehicle;

public class Vehicle {
	String color;
	int speed;
	
	// ����Ʈ ������
	public Vehicle() {}
	
	// ������
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	void show() {
		System.out.println("�ڵ��� ���� : " + color);
		System.out.println("�ڵ��� �ӵ� : " + speed);
	}
	
}
