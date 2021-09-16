package ch05;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class EventListenerEx8 {

	public static void main(String[] args) {
		new MyFrame8();
		
	}

}

class MyFrame8 extends JFrame {
	
	private JTextArea area;
	// keyAdapter ���� Ŭ������ �����ؼ� ������.
	
	public MyFrame8() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("Ű���� ������ ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		area = new JTextArea();
	}

	private void setInitLayout() {
		setVisible(true);
		add(area);
	}

	private void addEventListener() {
		area.addKeyListener(new MyKeyListener());
	}
	
	private class MyKeyListener extends KeyAdapter{
		
		@Override
		public void keyPressed(KeyEvent e) {
			display(e);
		}
		
		public void display(KeyEvent e) {
			int keyCode = e.getKeyCode();
			area.append(e.getKeyChar() +" :keyCode :" + keyCode + "\n");
			
			if(keyCode == KeyEvent.VK_UP) {
				System.out.println("����Ű�� ���� ���������ϴ�.");
			} else if(keyCode == KeyEvent.VK_DOWN) {
				System.out.println("����Ű�� �Ʒ��� ���������ϴ�.");
			} else if(keyCode == KeyEvent.VK_LEFT) {
				System.out.println("����Ű�� �������� ���������ϴ�.");
			} else if(keyCode == KeyEvent.VK_RIGHT) {
				System.out.println("����Ű�� ���������� ���������ϴ�.");
			}
		}
	}
	
	
}