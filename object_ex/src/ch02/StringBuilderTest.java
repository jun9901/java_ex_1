package ch02;

public class StringBuilderTest {

	public static void main(String[] args) {

		// StringBuilder, StringBuffer Ȱ���ϱ�
		// ���������� �������� char[]�� ��� ������ ����.
		// ���ڿ��� ������ �����ϰų� ������ �� ����ϸ� ������.
		// StringBuffer�� ��Ƽ ������ ���α׷��ֿ��� ����ȭ(synchronization)�� ����
		// ���� ������ ���α׷������� StringBuilder ����ϱ⸦ ����
		// String str1, StringBuilder str2
		// toString() �޼���� String ��ȯ�Ѵ�.
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append(android); // java + android
		System.out.println(buffer);
		System.out.println(System.identityHashCode(buffer));
		
		java = buffer.toString();
		System.out.println(java);
	}

}
