package inheritance2;

public class Main {
	public static void main(String[] args) {
		Child c = new Child("ȫ�浿", "123456-1324567", 1);
		
		System.out.println("name : " + c.name);
		System.out.println("ssn : " + c.ssn);
		System.out.println("childNo : " + c.ChildNo);
	}
}
