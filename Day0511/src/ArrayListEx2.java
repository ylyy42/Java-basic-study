import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("222");
		list.add(333);
		System.out.println(list);
		
		list.add(0, "000");
		System.out.println(list);
		
		System.out.println("index = " + list.indexOf("333"));
		
		list.remove("333");
		System.out.println(list);
		
		System.out.println(list.remove("333"));
		System.out.println(list);
		System.out.println("index = " + list.indexOf("333"));
		
		for(int i = 0; i < list.size(); i++) {
			list.set(i,  i+"");
		}
		System.out.print("{");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		System.out.println("}");
		
//		for(int i = 0; i < list.size(); i++) {
//			list.remove(i);
//		}
		for(int i = list.size() - 1; i >= 0; i--) {
			list.remove(i);
		}
		System.out.println(list);
	}
	
	
}
