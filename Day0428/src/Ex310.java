import java.util.Iterator;

public class Ex310 {
	public static void main(String[] args) {
		int array[][] = new int[4][4];
		
		int cnt = 0;
		int row = 0, col = 0;
		
		while(cnt < 10) {
			row = (int)(Math.random() * 4);
			col = (int)(Math.random() * 4);
			if(array[row][col] != 0) {
				continue;
			} else {
				array[row][col] = (int)(Math.random() * 9 + 1);
				cnt++;
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j<array[i].length; j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
