package ch04;

public class MainTest1 {

	public static void main(String[] args) {
		
		// ������ü 2 ����
		// ����ö ��ü 2����
		// �л� 2�� ����
		
		Bus bus1 = new Bus(1);
		Subway subway1 = new Subway(2);
		Student student1 = new Student("Ƽ��", 10000);
		
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
		
		Student student2 = new Student("����", 5000);
		Student student3 = new Student("����", 7000);
		
		student2.takeBus(bus2);
		student2.getOffBus(bus2);
		student2.showInfo();
		bus2.showInfo();
		System.out.println("------------");
		
		
		
		
		// ��ü�� ��ü���̿� ��ȣ�ۿ뿡 ���ؼ� ���α׷����� �� �� �ִ�.
	}

}
