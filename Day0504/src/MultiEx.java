
public class MultiEx {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.PrintLogo();
		phone.sendCall();
		phone.resiveCall();
		phone.flash();
	}
}
interface PhoneInterface {
	int TIMEOUT = 10000; //public static final
	void sendCall();	 //public abstract
	void resiveCall();	 //public abstract
	
	default void PrintLogo() {
		System.out.println("** Phone **");
	}
}
class SamsungPhone implements PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("�츮����������");
	}

	@Override
	public void resiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
	}
	
}
class phone {
	String model;
	String sno;
	public void resive() {
		System.out.println("�� ��ȭ�޾ҽ��ϴ�.");
	}
	public void call() {
		System.out.println("�ȳ��ϼ���.");
		
	}
}