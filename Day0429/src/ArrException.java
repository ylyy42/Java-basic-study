
public class ArrException {
	public static void main(String[] args) {
		int[] intArr = new int[5];
		intArr[0] = 0;
		try {
			for(int i = 0; i < 5; i++) {
				intArr[i+1] = i+1+intArr[i];
				System.out.println("intArr["+i+"]"+"="+intArr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �ε����� ������ ������ϴ�.");
		}
		
	}
}
