
public class SuperAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPER = 2;
	
	public int flyMode = NORMAL;
	
	public void fly() {
		if(flyMode == SUPER) {
			System.out.println("������ ������...");
		} else {
			super.fly();
		}
	}
}