package ch10;

public class Marine {
	private String name;
	private int power;
	private int hp;
	
	public Marine(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 100;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPower() {
		return this.power;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void showInfo() {
		System.out.println("===정보창(" + this.name +")===");
		System.out.println("이름 :" + this.name);
		System.out.println("공격력 :" + this.power);
		System.out.println("체력 :" + this.hp);
		System.out.println("=========");
	}
	
//	public void attackZealot(Zealot zealot) {
//		System.out.println(this.name + "이 질럿을 공격합니다.");
//		zealot.beAttacked(this.power);
//	}
//	
//	public void attackZergling(Zergling zergling) {
//		System.out.println(this.name + "이 저글링을 공격합니다.");
//		zergling.beAttacked(this.power);
//	}
	
	// 메서드 오버로딩
	public void attack(Zealot zealot) {
		System.out.println(this.name + "이" + zealot.getName() + "을 공격합니다.");
		zealot.beAttacked(this.power);
	}
	
	// 메서드 오버로딩
	public void attack(Zergling zergling) {
		System.out.println(this.name + "이" + zergling.getName() + "을 공격합니다.");
		zergling.beAttacked(this.power);
	}
	
	public void beAttacked(int power) {
		if(this.hp == 0) {
			System.out.println("이미 사망하였습니다.");
		} else {
			this.hp -= power;
		}
	}
}
