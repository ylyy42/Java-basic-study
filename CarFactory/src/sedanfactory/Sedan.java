package sedanfactory;

import component.Tire;

public class Sedan {

	public static void main(String[] args) {
		Tire compoTire = new component.Tire();
		compoTire.setSize(20);

		System.out.println(compoTire.getSize());
	}

}
