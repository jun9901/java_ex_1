package ch02;

public class StringTest1 {

	public static void main(String[] args) {
		
		// String 선언 방식
		// heap 메모리에 인스턴스로 생성되는 경우
		String str1 = new String("abc");
		
		// constant pool(Data, static)에 주소를 참조하는 방식
		String str2 = "abc";
		// 결론 : heap 메모리는 생성될때 마다 다른 주소 값을 가지지만, 상수 풀에 생성된 문자열은 모두 같은 주소 값을 가짐.
		// == 
		String str3 = new String("abc");
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		
		String str4 = "abc";
		String str5 = "abc";
		System.out.println(str4 == str5);
		
	}

}
