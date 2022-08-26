import java.util.ArrayList;

class Cust implements Runnable {
	private String food;
	private TableA table;
	Cust(TableA table, String food) {
		this.table = table;
		this.food = food;
	}
	
	public void run() {
		while(true) {
			String name = Thread.currentThread().getName();
			if(eatFood()) {
				System.out.println(name + "ate a" + food);
			} else {
				System.out.println(name + "fail to eat a" + food);
			}
		}
	}
	
	public boolean eatFood() {
		return table.remove(food);
	}
}
class CookA implements Runnable {
	private TableA table;
	CookA(TableA table){
		this.table = table;
	}
	public void run() {
		while(true) {
			int idx = (int)(Math.random() * table.dishNum());
			table.add(table.dishesName[idx]);
		}
	}
	
}

class TableA {
	String[] dishesName = {"donut","buger","cake","donut","buger"};
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<String>();
	public void add(String dish) {
		if(dishes.size() >= MAX_FOOD) {
			return;
		}
		dishes.add(dish);
		System.out.println("Dishes : " + dishes.toString());
	}
	public boolean remove(String dishName) {
		while(dishes.size() == 0) {
			String name = Thread.currentThread().getName();
			System.out.println(name + "is wating");
		}
		
		for(int i = 0; i < dishes.size(); i++) {
			if(dishName.equals(dishes.get(i))) {
				dishes.remove(i);
				return true;
			}
		}
		return false;
	}
	public int dishNum() {
		return dishesName.length;
	}
}

public class SynchTest {

	public static void main(String[] args) {
		TableA table = new TableA();
		new Thread(new CookA(table), "Cook").start();
		new Thread(new Cust(table, "buger"), "Cust1").start();
		new Thread(new Cust(table, "donut"), "Cust2").start();
		new Thread(new Cust(table, "cake"), "Cust3").start();
	}

}
