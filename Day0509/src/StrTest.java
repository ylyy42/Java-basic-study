
public class StrTest {
	public static void main(String[] args) {
		String str = "aabbccAABBCCaa";
		System.out.println(str);
		StringCount sc = new StringCount(str);
		System.out.println("aa��" + sc.stringCount("aa") + "�� ã�ҽ��ϴ�.");
	}
}
