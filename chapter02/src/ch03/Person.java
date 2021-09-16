package ch03;

public class Person {
	String name;
	int age;
	String sex;
	int height;
	int weight;
	
	public Person(String name, int age, String sex, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.height = height;
		this.weight = weight;
	}
	public void showInfo() {
		System.out.println("�̸� :" + this.name);
		System.out.println("���� :" + this.age);
		System.out.println("���� :" + this.sex);
		System.out.println("Ű :" + this.height);
		System.out.println("������ :" + this.weight);
	}
	public static void main(String[] args) {
		Person person1 = new Person("Toams", 37, "man", 180 , 37);
		person1.showInfo();
		System.out.println();
		Order order1 = new Order("01023450001", "�λ�� �ؿ�뱸 �쵿 111-333", 20210625, 130258, 3500, 0003);
		order1.showInfo();
	}
}

class Order {
	String orderNumber;
	String phoneNumber;
	String address;
	int orderDate;
	int orderTime;
	int orderPrice;
	int menuNumber;
	
	public Order( String phoneNumber, String address, int orderDate, int orderTime, int orderPrice,
			int menuNumber) {
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.menuNumber = menuNumber;
	}
	
	public void showInfo() {
		System.out.println("���� ��ȣ :" + this.orderDate + String.format("%04d", this.menuNumber));
		System.out.println("�ֹ� �ڵ��� ��ȣ :" + this.phoneNumber);
		System.out.println("�ֹ� �� �ּ� :" + this.address);
		System.out.println("�ֹ� ��¥ :" + this.orderDate);
		System.out.println("�ֹ� �ð� :" + this.orderTime);
		System.out.println("�ֹ� ���� :" + this.orderPrice);
		System.out.println("�޴� ��ȣ :" + String.format("%04d", this.menuNumber));
	}
	
	
	
	
}