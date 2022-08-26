package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long timeStart;
		long timeEnd;
		
		timeStart = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		timeEnd = System.nanoTime();
		System.out.println("ArrayList �ɸ� �ð� : " + (timeEnd - timeStart) + "ns");
		
		timeStart = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		timeEnd = System.nanoTime();
		System.out.println("LinkedList �ɸ� �ð� : " + (timeEnd - timeStart) + "ns");
	}

}
