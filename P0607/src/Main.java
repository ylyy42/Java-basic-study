class Tank {
	String name;
	int weapon;
	boolean missile;
	
	void tankInit(String name, int weapon, boolean missile) {
		this.name = name;
		this.weapon = weapon;
		this.missile = missile;
	}
	
	void tankInfo() {
		String k;
		if(missile) {
			k = "장착";
		} else {
			k = "미장착";
		}
		System.out.println("탱크명 : " + name + " 포종류 : " + weapon + "단계" + " 미사일 " + k);
	}
	
	void tankAttack() {
		
	}
	
}

public class Main {
	public static void main(String[] args) {
		Tank tank1 = new Tank();
		tank1.tankInit("K1",1,false);
		tank1.tankInfo();
	}
}