public class Ex307 {
	public static void main(String[] args) {
		int intArr [] = new int[10];
		int sum = 0;
		
		for(int i = 0; i < intArr.length; i++) {
			int j = (int)(Math.random()*10 + 1);
			
			intArr[i] = j;
			sum += intArr[i];
		}
		
		double result = (double)sum/10;
		
		System.out.println("ÃÑÇÕÀÇ Æò±Õ°ªÀº"+result);
	}
}
