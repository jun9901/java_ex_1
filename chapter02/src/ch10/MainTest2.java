package ch10;

public class MainTest2 {

	public static void main(String[] args) {
		// ������ �����͸� ������ ��Ƽ� �����ϱ� ���� ��
		int[] num = new int[12];
		
		Zealot[] zealot = new Zealot[12];
		
		// �迭�� for ���� �Բ� ���� ���
		for (int i = 0; i < zealot.length; i++) {
			zealot[i] = new Zealot("wlffjt" + i);
		}
		
		zealot[0].showInfo();
	}

}
