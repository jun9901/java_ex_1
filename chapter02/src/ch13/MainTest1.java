package ch13;

public class MainTest1 {
	public static void main(String[] args) {
		Unit zealot = new Zealot("����");
		Unit marine = new Marine("����");
		Unit zergling = new Zergling("���۸�");
		zealot.showInfo();
		marine.showInfo();
		zealot.attack(marine);
		marine.attack(zergling);
		zergling.attack(zealot);
		
	}
}
