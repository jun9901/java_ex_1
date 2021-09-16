package ch03;

public class MainTest2 {

	public static void main(String[] args) {
		Bus bus100 = new Bus(100);
		
		bus100.showInfo();
		
		Bus bus200 = new Bus(200, 1000);
		bus200.showInfo();
		bus200.showMoney();
		
		// 중요!!
		// 생성자는 객체가 처음 만들어질 때 제일 먼저 수행하는 코드
	}

}
