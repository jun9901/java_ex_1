package ch03;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class ComponentMainTest {
	public static void main(String[] args) {
		
		MyComponents address =  new MyComponents();
		
		System.out.println("글자를 입력 하세요.");
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.next(); 
		System.out.println(userInput);
		// 스캐너 사용해서 문자을 받습니다. 
		// textField 에 문자를 변경해 주세요. 
		address.textField.setText(userInput);
		address.pwField.setText("asdkfalksdhfalksjd");
	}
}

class MyComponents extends JFrame {
	
	private JPanel panel;
	private JButton button; 
	private JLabel label; 
	JTextField textField;
	JPasswordField pwField; 
	private JCheckBox checkBox; 
	
	public MyComponents() {
		initData();
		setInitLayout();
	}
	private void initData() {
		setTitle("컴포넌트 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		panel = new JPanel();
		button = new JButton("button");
		label = new JLabel("안녕하세요");
		textField = new JTextField("이름을 입력하세요", 20);
		pwField = new JPasswordField(20);
		checkBox = new JCheckBox("동의합니다", true);
	}
	
	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		panel.setBackground(Color.yellow);
		this.add(panel);
		panel.add(button);
		panel.add(label);
		panel.add(textField);
		panel.add(pwField);
		panel.add(checkBox);
	}
}

