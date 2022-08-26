package jungol;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		TreeSet<Person> perArr = new TreeSet<Person>();

		for (int i = 0; i < 5; i++) {
			perArr.add(new Person(sc.next(), sc.nextInt()));
		}
		sc.close();
		
		Iterator<Person> iterator = perArr.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();		
		}
		Iterator<Person> iterator2 = perArr.iterator();
		iterator2.next().print();
	}

}

class Person implements Comparable<Person> {
	private String name;
	private int height;

	public Person(String name, int height) {
		this.name = name;
		this.height = height;
	}

	void print() {
		System.out.println(name + " " + height);
	}

	@Override
	public int compareTo(Person p) {
		// TODO Auto-generated method stub
		if (height < p.height)
			return -1;
		else if (height == p.height)
			return 0;
		else {
			return 1;
		}
	}
}