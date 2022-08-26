
public class ValuePassing {
	int n;
	public void increase(ValuePassing v1) {
		this.n += 1;
	}
	public static void main(String[] args) {
		ValuePassing v1 = new ValuePassing();
		v1.increase(v1);
		System.out.println(v1.n);
		System.out.println(v1);
	}
}
