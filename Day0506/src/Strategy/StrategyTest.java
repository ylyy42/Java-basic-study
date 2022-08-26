package Strategy;

public class StrategyTest {
	public static void main(String[] args) {
		AnimalCall anicall = new AnimalCall();
		anicall.setAnimal(new Dog());
		anicall.callName();
		anicall.setAnimal(new Cat());
		anicall.callName();
	}
}
