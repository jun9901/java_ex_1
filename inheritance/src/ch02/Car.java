package ch02;

public class Car {
	String name;
	int price;
	// 포함 관계로 설계하여야 한다.
	Engine engine;
	
	public Car(String naem, int price) {
		this.name = name;
		this.price = price;
		this.engine = new Engine("GDI", 400);
	}
}
