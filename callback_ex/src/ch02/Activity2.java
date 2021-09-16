package ch02;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

// 호출자(콜리)
public class Activity2 extends JFrame {

	String name;
	JPanel panel;
	// 주소값을 담아둔다.
	CallbackCheckPosition callbackCheckPosition;

	public void setCallbackCheckPosition(CallbackCheckPosition callbackCheckPosition) {
		this.callbackCheckPosition = callbackCheckPosition;
	}

	public Activity2(String name) {
		this.name = name;
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle(name);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
	}

	private void setInitLayout() {
		setVisible(true);
		add(panel);
		setResizable(false);
		panel.setBackground(Color.yellow);
	}

	private void addEventListener() {
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				callbackCheckPosition.checkPosition(x, y);
			}
		});
	}

}
