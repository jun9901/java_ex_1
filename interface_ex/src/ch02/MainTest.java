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
		
		// 다형성 - 배(선박, 신체, 과일)
		// 배열만들어서 크기는 3개 0, 1, 2 인스턴스 변수 넣어주세요.
		RemoteController[] remote = new RemoteController[3];
		remote[0] = televison;
		remote[1] = refrigerator;
		remote[2] = robot;
		
		// 문제 1 확장 for문을 이용하여 turnOn() 메서드 호출
		for (RemoteController remoteController : remote) {
			remoteController.turnOn();
		}
		System.out.println("--------------");
		// 문제 2 확장 for문 이용하여 turnOff() 메서드 호출
		for (RemoteController remoteController : remote) {
			remoteController.turnOff();
		}
		System.out.println("--------------");
		// 문제 3 for문을 이용해서 클래스 타입이 ToyRobot이면 name 을 화면에 출력
		for (int i = 0; i < remote.length; i++) {
			if(remote[i] instanceof ToyRobot) {
				String name = ((ToyRobot)remote[i]).name;
				System.out.println(name);
			}
		}
		
		// 요구 사항 추가!! 인터페이스 추가
		// 냉장고에 문이 열렸으면 멜로디 소리를 나게 하라.
		// 장난감 로봇의 건전지가 거의 없으면 멜로디 소리를 나게 하라.
		
		// 인터페이스 장점.
		// 표준화가 가능하다.
		// 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다.
		// 클래스간에 결합도를 낮춰서 유연한 코드를 설계 할 수 있다.
		
		// 정리
		// 객체지향 패러다임 핵심
		// 객체와 객체간의 상호 협력해서 코드를 설계해 나간다(버스, 지하철, 학생, 스타크래프트)
		// 객체와 객체간의 관계를 정희하여 코드를 설계해 나간다(상속, 포함관계, 추상클래스, 인터페이스),
		// 다형성(클래스를 다양한 형태로 바라본다)!!!
	}
}
