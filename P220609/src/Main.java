class Tank {
	protected String name = "X2흑표";
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
		System.out.printf("탱크명 : %s\n", name);
		System.out.printf("%d단계 포 장착\n", canon);
		System.out.printf("미사일 %s장착\n", missile?"":"미");
		System.out.printf("핵미사일 %s장착\n", nuclear?"":"미");
		System.out.println();
	}
	
	// 이동
	void moving() {
		
	}
	
	// 포 발사
	void Cannonfire() {
		
	}
	
	// 미사일 발사
	void Missilefire() {
		
	}
	
}

public class Main {
	public static void main(String[] args) {
		Tank tank1 = new Tank();
		tank1.specview();
	}
}
