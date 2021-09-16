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
		System.out.println("===����â(" + this.name +")===");
		System.out.println("�̸� :" + this.name);
		System.out.println("���ݷ� :" + this.power);
		System.out.println("ü�� :" + this.hp);
		System.out.println("=========");
	}
	
//	public void attackZealot(Zealot zealot) {
//		System.out.println(this.name + "�� ������ �����մϴ�.");
//		zealot.beAttacked(this.power);
//	}
//	
//	public void attackZergling(Zergling zergling) {
//		System.out.println(this.name + "�� ���۸��� �����մϴ�.");
//		zergling.beAttacked(this.power);
//	}
	
	// �޼��� �����ε�
	public void attack(Zealot zealot) {
		System.out.println(this.name + "��" + zealot.getName() + "�� �����մϴ�.");
		zealot.beAttacked(this.power);
	}
	
	// �޼��� �����ε�
	public void attack(Zergling zergling) {
		System.out.println(this.name + "��" + zergling.getName() + "�� �����մϴ�.");
		zergling.beAttacked(this.power);
	}
	
	public void beAttacked(int power) {
		if(this.hp == 0) {
			System.out.println("�̹� ����Ͽ����ϴ�.");
		} else {
			this.hp -= power;
		}
	}
}
