package ch02;

public class MainTest {

	public static void main(String[] args) {
		
		Televison televison = new Televison();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot robot = new ToyRobot();
		
		televison.turnOn();
		televison.turnOff();
		System.out.println("--------------");
		refrigerator.turnOn();
		refrigerator.turnOff();
		System.out.println("--------------");
		robot.turnOn();
		robot.turnOff();
		
		// ������ - ��(����, ��ü, ����)
		// �迭���� ũ��� 3�� 0, 1, 2 �ν��Ͻ� ���� �־��ּ���.
		RemoteController[] remote = new RemoteController[3];
		remote[0] = televison;
		remote[1] = refrigerator;
		remote[2] = robot;
		
		// ���� 1 Ȯ�� for���� �̿��Ͽ� turnOn() �޼��� ȣ��
		for (RemoteController remoteController : remote) {
			remoteController.turnOn();
		}
		System.out.println("--------------");
		// ���� 2 Ȯ�� for�� �̿��Ͽ� turnOff() �޼��� ȣ��
		for (RemoteController remoteController : remote) {
			remoteController.turnOff();
		}
		System.out.println("--------------");
		// ���� 3 for���� �̿��ؼ� Ŭ���� Ÿ���� ToyRobot�̸� name �� ȭ�鿡 ���
		for (int i = 0; i < remote.length; i++) {
			if(remote[i] instanceof ToyRobot) {
				String name = ((ToyRobot)remote[i]).name;
				System.out.println(name);
			}
		}
		
		// �䱸 ���� �߰�!! �������̽� �߰�
		// ����� ���� �������� ��ε� �Ҹ��� ���� �϶�.
		// �峭�� �κ��� �������� ���� ������ ��ε� �Ҹ��� ���� �϶�.
		
		// �������̽� ����.
		// ǥ��ȭ�� �����ϴ�.
		// ���� ������� Ŭ�����鿡�� ���踦 �ξ� �� �� �ִ�.
		// Ŭ�������� ���յ��� ���缭 ������ �ڵ带 ���� �� �� �ִ�.
		
		// ����
		// ��ü���� �з����� �ٽ�
		// ��ü�� ��ü���� ��ȣ �����ؼ� �ڵ带 ������ ������(����, ����ö, �л�, ��Ÿũ����Ʈ)
		// ��ü�� ��ü���� ���踦 �����Ͽ� �ڵ带 ������ ������(���, ���԰���, �߻�Ŭ����, �������̽�),
		// ������(Ŭ������ �پ��� ���·� �ٶ󺻴�)!!!
	}
}
