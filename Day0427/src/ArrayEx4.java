
public class ArrayEx4 {
	public static void main(String[] args) {
		int sum = 0, max = 0, min = 100;
		double avg = 0.0;
		int[] score = new int[7];
		for(int i = 0; i < score.length; i++) {
			score[i] = (int)(Math.random()*40) + 61;
			System.out.println(score[i]);
			sum += score[i];
		}
		avg = (double)sum / score.length;
		int temp = (int)(avg*100);
		avg = temp/100.0;
		System.out.println("������"+sum);
		System.out.println("�����"+avg);
		for(int i = 0; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}
			if(score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("�ִ밪"+max);
		System.out.println("�ּҰ�"+min);
	}
}
