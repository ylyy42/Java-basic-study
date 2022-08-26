public class Main {
	static int stm;
	int gen;
	
	static {
		stm = 5;
	}
	
	static void stmout() {
		System.out.println(stm);
	}
	
	void genout() {
		System.out.println(gen);
		System.out.println(stm);
		stmout();
		System.out.println(this.gen);
	}
	
	static void stmout2(Main main) {
		main.genout();
	}
	
	public static void main(String[] args) {
		Main.stmout2(new Main());
	}

}
