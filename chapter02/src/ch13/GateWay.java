package ch13;

public class GateWay {
	
	public static int zealotCount;
	public static int dragoonCount;
	public static int darkTemplerCount;
	
	
	private int gateWayId;
	private String name;
	
	public GateWay(int id) {
		this.gateWayId = id;
		name = "����Ʈ����";
	}
	
	// �޼��� ���� Ÿ������ ��ü�� ����
	// ������ �����ϱ�
	// 3�� -> 
	// public ���� Ÿ��createUnit(){};
	
	public Unit creatUnit(int number) {
		// �Ű����� 1. ����
		// �Ű����� 2. ���
		// �Ű����� 3. ��ũ���÷�
		if(number == 1) {
			zealotCount++;
			System.out.println("������ �����մϴ�.");
			return new Zealot("����" + zealotCount);
		} else if(number == 2) {
			dragoonCount++;
			System.out.println("����� �����մϴ�.");
			return new Dragoon("���" + dragoonCount);
		} else {
			darkTemplerCount++;
			System.out.println("��ũ���÷��� �����մϴ�.");
			return new Dragoon("��ũ���÷�" + darkTemplerCount);
		}
		
	}
}
