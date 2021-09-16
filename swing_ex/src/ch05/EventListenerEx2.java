package ch05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class EventListenerEx2 {

	public static void main(String[] args) {
		new MyFrame2();
	}

}
class MyFrame2 extends JFrame implements ActionListener{
	
	JButton button1;
	JButton button2;
	
	public MyFrame2() {
		InitData();
		setInitLayout();
		addEventListener();
	}
	
	public void InitData(){
		setTitle("�̺�Ʈ ������ ����2");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		button1 = new JButton("button1");
		button2 = new JButton("button2");
	}
	
	public void setInitLayout(){
		setVisible(true);
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
		
	}
	
	public void addEventListener(){
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// System.out.println("ActionEvent �Ͼ�� ���� �޼��忡�� ���۵�!!!");
		// System.out.println(e.toString());
		JButton clickedButton = (JButton)e.getSource();
		System.out.println(clickedButton.getText());
		if(clickedButton.getText().equals("button1")) {
			System.out.println("1�� ��ư�� Ŭ���Ǿ����ϴ�.");
		} else {
			System.out.println("2�� ��ư��"
					+ " Ŭ���Ǿ����ϴ�.");
		}
	}
}
