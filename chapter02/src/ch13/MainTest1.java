package ch13;

public class MainTest1 {
	public static void main(String[] args) {
		Unit zealot = new Zealot("질럿");
		Unit marine = new Marine("마린");
		Unit zergling = new Zergling("저글링");
		zealot.showInfo();
		marine.showInfo();
		zealot.attack(marine);
		marine.attack(zergling);
		zergling.attack(zealot);
		
	}
}
