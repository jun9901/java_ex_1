package ch02;

public class MainTest {
	
	public static void main(String[] args) {
		Activity1 activity1 = new Activity1("Activity1");
		Activity2 activity2 = new Activity2("Activity2");
		// �޼��带 ����ؼ� �ݹ� �����ϱ�
		activity2.setCallbackCheckPosition(activity1.callbackCheckPosition);
		
		
	}
}
