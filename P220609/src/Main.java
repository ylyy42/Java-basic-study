class Tank {
	protected String name = "X2��ǥ";
	protected int canon = 3;
	protected boolean missile = true;
	protected boolean nuclear = true;
	
	Tank() {
		super();
	}
	
	Tank(String name, int canon, boolean missile, boolean nuclear) {
		this.name = name;
		this.canon = canon;
		this.missile = missile;
		this.nuclear = nuclear;
		
	}
	
	void specview() {
		System.out.printf("��ũ�� : %s\n", name);
		System.out.printf("%d�ܰ� �� ����\n", canon);
		System.out.printf("�̻��� %s����\n", missile?"":"��");
		System.out.printf("�ٹ̻��� %s����\n", nuclear?"":"��");
		System.out.println();
	}
	
	// �̵�
	void moving() {
		
	}
	
	// �� �߻�
	void Cannonfire() {
		
	}
	
	// �̻��� �߻�
	void Missilefire() {
		
	}
	
}

public class Main {
	public static void main(String[] args) {
		Tank tank1 = new Tank();
		tank1.specview();
	}
}
