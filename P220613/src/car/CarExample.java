package car;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		String[] strar = {"�տ���","�տ�����","�ڿ���","��������"};

		for(int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			
			if(problemLocation != 0) {
				System.out.println(strar[problemLocation - 1] + " HankookTire�� ��ü");
				car.tires[problemLocation-1] = new HankookTire(strar[problemLocation - 1], 15);
			}

			System.out.println("--------------------------");
		}
	}
}

