class Tv{
	boolean power;
	int channel;
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

class CaptionTv extends Tv {
	String text;
	void caption() {
		System.out.println("CaptionTv method~~");
	}
}

public class TvTest {
	public static void main(String[] args) {
		Tv t = new CaptionTv();
		// CaptionTv c = new Tv();
		// t.caption();
		CaptionTv c1 = (CaptionTv)t;
		c1.caption();
	}
}
