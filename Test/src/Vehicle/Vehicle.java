package Vehicle;

public class Vehicle {
	String color;
	int speed;
	
	// 디폴트 생성자
	public Vehicle() {}
	
	// 생성자
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	void show() {
		System.out.println("자동차 색상 : " + color);
		System.out.println("자동차 속도 : " + speed);
	}
	
}
