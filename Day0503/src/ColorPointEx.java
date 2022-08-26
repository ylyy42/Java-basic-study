public class ColorPointEx {

	public static void main(String[] args) {
		Point p = new Point();
		p.set(5, 5);
		p.showPoint();
		
		ColorPoint cp1 = new ColorPoint();
		cp1.set(3, 4);
		cp1.setColor("red");
		cp1.showColorPoint();
	}

}

class Point {
	private int x, y;
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
		
}
class ColorPoint extends Point {
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}

}