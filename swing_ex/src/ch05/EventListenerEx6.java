package ch05;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class EventListenerEx6 {

	public static void main(String[] args) {
		new MyFrame6();
		
	}

}

class MyFrame6 extends JFrame {
	
	public MyFrame6() {
		initData();
		setInitLayout();
		addEventListener();
		
	}
	
	public void initData() {
		setTitle("����� Ŭ���� �̿� ���");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}
	
	public void setInitLayout() {
		setVisible(true);
		
	}
	
	public void addEventListener() {
		this.addMouseListener(new MyMouseListener());
	}
	
	// ���� Ŭ����
	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			super.mouseClicked(e);
			int x = e.getX();
			int y = e.getY();
			System.out.println("X :" + x);
			System.out.println("Y :" + y);
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println("���콺�� ���Խ��ϴ�.");
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			System.out.println("���콺�� �������ϴ�.");
		}
	}
	
}