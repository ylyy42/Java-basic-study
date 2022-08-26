package p;

import q.B;

public class A {

	public static void main(String[] args) {
		System.out.println("package p Class A");
	}
	void f() {
		B b = new B();
		b.g();
		b.n = 10;
	}
}
