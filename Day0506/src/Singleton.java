
public class Singleton {
	private static Singleton instance;
//	private Singleton() {}
	public static Singleton getInstance() {
		if(instance == null) {
			System.out.println("create instance");
			instance = new Singleton();
		}
		return instance;
	}
}
