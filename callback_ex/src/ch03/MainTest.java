package ch03;

public class MainTest {

	public static void main(String[] args) {
		Activity1 activity1 = new Activity1("첫번째 화면");
		Activity2 activity2 = new Activity2("두번째 화면");
		activity2.callbackCheckPosition = activity1.callbackCheckPosition;
		
	}

}
