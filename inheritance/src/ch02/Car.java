package ch02;

public class Car {
	String name;
	int price;
	// ���� ����� �����Ͽ��� �Ѵ�.
	Engine engine;
	
	public Car(String naem, int price) {
		this.name = name;
		this.price = price;
		this.engine = new Engine("GDI", 400);
	}
}
