package Strategy;

public class AnimalCall {

	private Animal animal;
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	public void callName() {
		animal.printName();
	}
}
