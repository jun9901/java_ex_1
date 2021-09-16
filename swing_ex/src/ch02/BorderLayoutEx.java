package ch02;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame{

	private BorderLayout borderLayout;
	JButton[] buttons = new JButton[5];
	String[] titles = {"북", "센터", "남", "동", "서"};
	String[] direction = {BorderLayout.NORTH, BorderLayout.CENTER, BorderLayout.SOUTH, BorderLayout.EAST, BorderLayout.WEST};
	
	public BorderLayoutEx() {
	
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("BorderLayout 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		borderLayout = new BorderLayout();
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(titles[i]);
		}
	}

	private void setInitLayout() {
		setVisible(true);
		for (int i = 0; i < buttons.length;
				i++) {
			add(buttons[i], direction[i]);
		}
		
	}

	public static void main(String[] args) {
		new BorderLayoutEx();
		
	}
}
