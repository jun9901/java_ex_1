package ch13;

public class GateWay {
	
	public static int zealotCount;
	public static int dragoonCount;
	public static int darkTemplerCount;
	
	
	private int gateWayId;
	private String name;
	
	public GateWay(int id) {
		this.gateWayId = id;
		name = "게이트웨이";
	}
	
	// 메서드 리턴 타입으로 객체를 생성
	// 질럿을 생산하기
	// 3분 -> 
	// public 리턴 타입createUnit(){};
	
	public Unit creatUnit(int number) {
		// 매개변수 1. 질럿
		// 매개변수 2. 드라군
		// 매개변수 3. 다크템플러
		if(number == 1) {
			zealotCount++;
			System.out.println("질럿을 생산합니다.");
			return new Zealot("질럿" + zealotCount);
		} else if(number == 2) {
			dragoonCount++;
			System.out.println("드라군을 생산합니다.");
			return new Dragoon("드라군" + dragoonCount);
		} else {
			darkTemplerCount++;
			System.out.println("다크템플러를 생산합니다.");
			return new Dragoon("다크템플러" + darkTemplerCount);
		}
		
	}
}
