package ch02;

public class StringTest2 {

	public static void main(String[] args) {

		// 한번 생성된 String 불변(immutable)
		
		// String을 연결하면 기존의 String에 연결되는 것이 아닌 새로운 문자열이 생성됨.
		String java = new String("java");
		String android = new String("Android");
		
		// String 변수에 주소값을 확인해보고 싶다면
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		System.out.println(android);
		System.out.println("----------------------");
		
		// java = java + android;
		java = java.concat(" " + android);
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
	}

}
