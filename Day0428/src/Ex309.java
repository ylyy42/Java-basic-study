import java.util.Iterator;

public class Ex309 {
	public static void main(String[] args) {
		int array[][] = new int[4][4];
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				int num = (int)(Math.random() * 100 + 1);
				array[i][j] = num;
				System.out.println(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
