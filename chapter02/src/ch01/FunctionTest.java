package ch01;

public class FunctionTest {

	public static void main(String[] args) {
		// �Լ� ����ϱ�
		int result1 = add(100, 50);
		System.out.println(result1);
		
	}

	public static int add(int num1, int num2) {
		// �Լ��ȿ� ����ϴ� ������ ����������� �θ���.
		int result;
		result = num1 + num2;
		return result;
	}
}
