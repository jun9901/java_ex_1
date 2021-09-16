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
		System.out.println("이름 :" + this.name);
		System.out.println("나이 :" + this.age);
		System.out.println("성별 :" + this.sex);
		System.out.println("키 :" + this.height);
		System.out.println("몸무게 :" + this.weight);
	}
	public static void main(String[] args) {
		Person person1 = new Person("Toams", 37, "man", 180 , 37);
		person1.showInfo();
		System.out.println();
		Order order1 = new Order("01023450001", "부산시 해운대구 우동 111-333", 20210625, 130258, 3500, 0003);
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
		System.out.println("접수 번호 :" + this.orderDate + String.format("%04d", this.menuNumber));
		System.out.println("주문 핸드폰 번호 :" + this.phoneNumber);
		System.out.println("주문 집 주소 :" + this.address);
		System.out.println("주문 날짜 :" + this.orderDate);
		System.out.println("주문 시간 :" + this.orderTime);
		System.out.println("주문 가격 :" + this.orderPrice);
		System.out.println("메뉴 번호 :" + String.format("%04d", this.menuNumber));
	}
	
	
	
	
}