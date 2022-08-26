
public class ArrEx10 {
	public static void main(String[] args) {
		int[] number = {1,2,3,4,5};
		int[] newNumber = new int[10];
		
		System.arraycopy(number, 0, newNumber, 0, 0);
		
		for(int i = 0; i < newNumber.length; i++) {
			System.out.println(newNumber[i]);
		}
	}
}
