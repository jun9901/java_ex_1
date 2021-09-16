package ch02;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx extends JFrame{

	ArrayList<JButton> button = new ArrayList<>();
	private final int MAX_COUNT = 3;
	
	public NoLayoutEx() {
		
		initData();
		setInitLayout();
	}
	
	private void initData() {

		setTitle("NoLayout ¿¬½À");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		for (int i = 0; i < MAX_COUNT; i++) {
			button.add(new JButton(Integer.toString(i + 1)));
		}
	}
	
	private void setInitLayout() {
	
		setVisible(true);
		setLayout(null);
		
		for (int i = 0; i < button.size(); i++) {
			button.get(i).setSize(50, 50);
			button.get(i).setLocation(setupPosition(50, i), setupPosition(50, i));
			add(button.get(i));
		}
	}
		
	private int setupPosition(int size, int index) {
		int result = (index + 1) * size;
		return result;
	}
	
	public static void main(String[] args) {
	
		new NoLayoutEx();
	}

}
