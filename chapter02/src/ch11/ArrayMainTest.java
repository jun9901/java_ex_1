package ch11;

public class ArrayMainTest {

	public static void main(String[] args) {
		// �迭
		// �迭�̶� ������ �����͸� ��Ƽ� ������ �����ϱ� ���� ����ϴ� ������ Ÿ���̴�.
		// ������ �ϳ��� �����͸� �����ϱ� ���� ���̶�� �迭�� �������� �����͸� �ϳ��� ������ �����ϱ� ���� ��.
		
		int number = 10;
		
		// ���� ���
		int[] arr1 = new int[3];
		int arr2[] = new int[10];
		
		// �ʱ�ȭ �ϴ� ���(���� �ִ� ���)
		arr1[0] = 33;
		arr1[1] = 10;
		arr1[2] = 11;
		
		// �迭 ����� ���ÿ� �ʱ�ȭ �ϱ�
		int[] number1 = new int[] {11, 20, 30};
		int[] number2 = {10, 50, 100};
		
		// ��� ���
		System.out.println(number1[0]);
		System.out.println (number1[1]);
		System.out.println(number1[2]);
		
		//
		String[] strArr = new String[10];
		strArr[0] = "�߽���";
		strArr[1] = "Ƽ��";
		strArr[2] = "�ֽ�";
		strArr[3] = "�ٸ��콺";
		
		// ���� 1. strArr 0, 1, 2, 3 ȭ�鿡 ���! �� for�� �����������.
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		System.out.println(strArr[3]);
		
		// ��� ���α׷��� ������ index�� ������ 0 ���� ������ �Ѵ�.
		System.out.println(strArr.length);
		System.out.println(strArr[10]); // index�� ũ��� n - 1��
		// new int[22]; // 0 ~ 21
		// new int[74]; // 0 ~ 73
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
			if(strArr[i] == null) {
				break;
			}
		}
		
	}

}
