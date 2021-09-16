package ch04;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 버스객체 2 생성
		// 지하철 객체 2생성
		// 학생 2명 생성
		
		Bus bus1 = new Bus(1);
		Subway subway1 = new Subway(2);
		Student student1 = new Student("티모", 10000);
		
		student1.takeBus(bus1);
		student1.showInfo();
		
		bus1.showInfo();
		System.out.println("------------");
		
		student1.takeSubway(subway1);
		student1.showInfo();
		subway1.showInfo();
		System.out.println("------------");
		
		Bus bus2 = new Bus(2);
		Bus bus3 = new Bus(3);
		
		Subway subway2 = new Subway(3);
		Subway subway3 = new Subway(4);
		
		Student student2 = new Student("가렌", 5000);
		Student student3 = new Student("럭스", 7000);
		
		student2.takeBus(bus2);
		student2.getOffBus(bus2);
		student2.showInfo();
		bus2.showInfo();
		System.out.println("------------");
		
		
		
		
		// 객체와 객체사이에 상호작용에 의해서 프로그래밍을 할 수 있다.
	}

}
