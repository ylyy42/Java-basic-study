import java.util.ArrayList;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		ArrayList<String> sl = new ArrayList();
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		System.out.println(v);
		v.add(2,100);
		System.out.println("����ִ� ��� ����" + v.size());
		System.out.println("���� ����" + v.capacity());
		for(int i = 0; i < v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		System.out.println(v);
		int sum = 0;
		for(int i = 0; i < v.size(); i++) {
			int n = v.remove(i);
			sum += n;
		}
		System.out.println("�հ�" + sum);
		System.out.println(v);
	}
}
