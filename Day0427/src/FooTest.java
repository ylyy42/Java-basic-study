
public class FooTest {
	static void foo(String s, int... i) {
		System.out.print(s+" ");
		for(int j: i)
			System.out.print(j+" ");
			System.out.println();
	}

	public static void main(String[] args) {
		foo("�ȳ�",1);
		foo("�ȳ��ϼ���",1,2);
		foo("�� �־�");
	}
}
