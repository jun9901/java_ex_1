package ch05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventListenerEx4 {
	
	public static void main(String[] args) {
		new MyFrame4();
	}
}

class MyFrame4 extends JFrame{
	
	JButton button;
	
	public MyFrame4() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	public void initData() {
		setTitle("�͸�����ü��� ����");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		button = new JButton("��ư1");
		
	}
	
	public void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		add(button);
	}
	
	public void addEventListener() {
		// �͸� ���� ��ü
		// ��ȸ���� �������̽��� �͸� ��ü�� ���� ����� �� �ִ�.
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư�� Ŭ����!!");
			}
		});
	}
}
