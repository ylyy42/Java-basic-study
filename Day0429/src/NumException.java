
public class NumException {

	public static void main(String[] args) {
		String[] strNumStrings = {"23","12","abc","3.141592","998"};
		int i = 0;
		try {
			for(i = 0; i<strNumStrings.length; i++) {
				int j = Integer.parseInt(strNumStrings[i]);
				System.out.println("���ڷ� ��ȯ�� ���� "+ j);
			}
		} catch (NumberFormatException e) {
			System.out.println(strNumStrings[i] + "�� ������ ��ȯ�� �� �����ϴ�.");
		}
	}

}
