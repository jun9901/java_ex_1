package ch00;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainActivity extends JFrame implements CallbackBtnAction {
	int count;
	JLabel label;

	public MainActivity() {
		count = 0;
		label = new JLabel(count + "");
		setSize(300, 300);
		setLayout(new FlowLayout());
		add(label);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void clickedAddBtn() {
		System.out.println("+버튼 콜백 받았습니다.");
		count++;
		label.setText(count + "");
	}

	@Override
	public void clickedMinusBtn() {
		System.out.println("-버튼 콜백 받았습니다.");
		count--;
		label.setText(count + "");		
	}
	
	@Override
	public void passValue(int value) {
		label.setText("매개 변수로 값 전달 받음 :" + value);
	}
}
