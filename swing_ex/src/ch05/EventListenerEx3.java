package ch05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventListenerEx3 {
	
	public static void main(String[] args) {
		
		new ColorChangeFrame();
	}
}

class ColorChangeFrame extends JFrame implements ActionListener{
	
	BorderLayout borderLayout;
	JPanel panel1;
	JPanel panel2;
	JButton button1;
	JButton button2;
	
	public ColorChangeFrame() {
		InitData();
		setInitLayout();
		addEventListener();
	}
	
	public void InitData(){
		setTitle("이벤트 리스너 연습3");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		borderLayout = new BorderLayout();
		panel1 = new JPanel();
		panel1.setBackground(Color.gray);
		panel1.setPreferredSize(new Dimension(500, 400));
		panel2 = new JPanel(new FlowLayout());
		button1 = new JButton("빨간색");
		button2 = new JButton("노란색");
	}
	
	public void setInitLayout(){
		setVisible(true);
		this.setLayout(new BorderLayout());
		add(panel1, BorderLayout.NORTH);
		add(panel2, borderLayout.SOUTH);
		
		panel2.add(button1);
		panel2.add(button2);
	}
	
	public void addEventListener(){
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton targetBtn = (JButton)e.getSource();
		if(targetBtn.equals(button1)) {
			panel1.setBackground(Color.red);
		} else {
			panel1.setBackground(Color.yellow);
		}
	}
}
