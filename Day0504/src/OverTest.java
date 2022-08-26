class Weapon {
		protected int fire() {
		return 1;
	}
}

class Cannon extends Weapon {
	
	@Override
	protected int fire() {
		return 10;
	}
	
}

public class OverTest {
	public static void main(String[] args) {
		Weapon weapon = new Weapon();
		System.out.println("기본 무기의 살상능력 : " + weapon.fire());
		weapon = new Cannon();
		System.out.println("대포의 살상능력 : " + weapon.fire());
	}
}
