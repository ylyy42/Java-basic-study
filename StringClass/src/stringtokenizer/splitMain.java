package stringtokenizer;

public class splitMain {

	public static void main(String[] args) {
		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-Simon";
		
		String[] names = text.split("&|,|-");
		for(String name : names) {
			System.out.println(name);
		}
	}

}
