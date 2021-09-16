package ch13;

public class MainTest2 {

	public static void main(String[] args) {
		GateWay gateWay = new GateWay(1);
		Unit zealot1 = gateWay.creatUnit(1);
		Unit zealot2 = gateWay.creatUnit(1);
		Unit zealot3 = gateWay.creatUnit(1);
		
		Unit Dragoon1 = gateWay.creatUnit(2);
		Unit Dragoon2 = gateWay.creatUnit(2);
		
		Unit DarkTempleor = gateWay.creatUnit(3);
		zealot1.attack(zealot3);
		
		System.out.println(GateWay.zealotCount);
		System.out.println(GateWay.dragoonCount);
		System.out.println(GateWay.darkTemplerCount);
		Dragoon1.attack(DarkTempleor);
		
	}

}
