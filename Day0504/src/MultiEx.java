
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
		System.out.println("띠리리리리리링");
	}

	@Override
	public void resiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
	
}
class phone {
	String model;
	String sno;
	public void resive() {
		System.out.println("네 전화받았습니다.");
	}
	public void call() {
		System.out.println("안녕하세요.");
		
	}
}