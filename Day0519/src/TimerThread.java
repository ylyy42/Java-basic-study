public class TimerThread extends Thread {
	
	private int n = 0;
	private boolean flag = false; // false�� �ʱ�ȭ
	public void finish() { flag = true; }
	
	@Override
	public void run() {
		while(true) {
			System.out.println(n); // ȭ�鿡 ī��Ʈ �� ���
			n++;
			try {
				sleep(1000);
				if(flag == true)
					return; // ������ ����
			}
			catch(InterruptedException e){
				return;
			}
		}
	}


	public static void main(String[] args) {
		TimerThread th = new  TimerThread();
		th.start();
		System.out.println("================");
		th.finish(); // TimerThread ���� ����

	}

}
