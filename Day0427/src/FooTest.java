
public class FooTest {
	static void foo(String s, int... i) {
		System.out.print(s+" ");
		for(int j: i)
			System.out.print(j+" ");
			System.out.println();
	}

	public static void main(String[] args) {
		foo("안녕",1);
		foo("안녕하세요",1,2);
		foo("잘 있어");
	}
}
