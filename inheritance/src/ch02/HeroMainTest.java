package ch02;

public class HeroMainTest {

	public static void main(String[] args) {
		Warrior warrior = new Warrior("전사", 100);
		Archer archer = new Archer("궁수", 100);
		Wizard wizard = new Wizard("마법사", 100);
		
		warrior.attack();
		
	}
	
}
