package ch10;

public class Zealot {
	private String name;
	private int power;
	private int hp;
	
	public Zealot(String name) {
		this.name = name;
		this.power = 10;
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
		System.out.println("===����â===");
		System.out.println("�̸� :" + this.name);
		System.out.println("���ݷ� :" + this.power);
		System.out.println("ü�� :" + this.hp);
		System.out.println("=========");
	}
	
//	// ������ ������ �����մϴ�.
//	public void attackMarine(Marine marine) {
//		System.out.println(this.name + "�� ������ �����մϴ�.");
//		marine.beAttacked(this.power);
//	}
//	
//	// ������ ���۸��� �����մϴ�.
//	public void attackZergling(Zergling zergling) {
//		System.out.println(this.name + "�� ���۸��� �����մϴ�.");
//		zergling.beAttacked(this.power);
//	}
	
	// �޼��� �����ε�
	public void attack(Marine marine) {
		System.out.println(this.name + "��" + marine.getName() + "�� �����մϴ�.");
		marine.beAttacked(this.power);
	}
	
	// �޼��� �����ε�
	public void attack(Zergling zergling) {
		System.out.println(this.name + "��" + zergling.getName() + "�� �����մϴ�.");
		zergling.beAttacked(this.power);
	}
	
	// ������ �޽��ϴ�.
	public void beAttacked(int power) {
		if(this.hp == 0) {
			System.out.println("�̹� ����Ͽ����ϴ�.");
		} else {
			this.hp -= power;
		}
	}
}
