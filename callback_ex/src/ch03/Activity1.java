package ch03;

import java.awt.Color;

public class Activity1 extends BaseActivity {

	CallbackCheckPosition callbackCheckPosition = new CallbackCheckPosition() {

		@Override
		public void checkPosition(int x, int y) {
			System.out.println("x :" + x);
			System.out.println("y :" + y);
		}
	};

	public Activity1(String name) {
		super(name);
	}

	@Override
	public void setInitLayout() {
		super.setInitLayout();
		panel.setBackground(Color.blue);
	}

}
