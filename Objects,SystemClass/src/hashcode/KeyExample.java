package hashcode;

public class KeyExample {

	public static void main(String[] args) {
		Key k1 = new Key(3);
		Key k2 = new Key(5);
		Key k3 = k1;
		
		System.out.println("K1.hashCode() : " + k1.hashCode());
		System.out.println("K2.hashCode() : " + k2.hashCode());
		System.out.println("K3.hashCode() : " + k3.hashCode());
	}

}
