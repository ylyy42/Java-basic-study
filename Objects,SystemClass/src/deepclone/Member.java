package deepclone;

import java.util.Arrays;

public class Member implements Cloneable {
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		// 먼저 얕은 복사를 하여 name, age를 복제한다
		Member cloned = (Member)super.clone();
		
		// scores를 깊은 복제한다
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		
		//car를 깊은 복제한다
		cloned.car = new Car(this.car.model);
		
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member)clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
		}
		return cloned;
	}
}
