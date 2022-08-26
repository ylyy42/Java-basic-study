public class Ex312 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		for(int i = 0; i < args.length; i++) {
			try {
				num += Integer.parseInt(args[i]);
				sum += num;
			} catch (NumberFormatException e) {
				 e.printStackTrace();
			}
		}
		System.out.println(sum);
	}
}