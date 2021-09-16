package ch00;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class SubActivity extends JFrame implements ActionListener{

	JButton btnAdd;
	JButton btnMinus;
	JButton btnpassValue;
	
	CallbackBtnAction callbackBtnAction;
	
	public SubActivity(CallbackBtnAction callbackBtnAction) {
		this.callbackBtnAction = callbackBtnAction;
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		btnAdd = new JButton("더하기 버튼");
		btnMinus = new JButton("마이너스 버튼");
		btnpassValue = new JButton("값 전달하기");
		
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		
		add(btnAdd);
		add(btnMinus);
		add(btnpassValue);
		
		btnAdd.addActionListener(this);
		btnMinus.addActionListener(this);
		btnpassValue.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton targetBtn = (JButton)e.getSource();
		if(targetBtn.getText().equals(btnAdd.getText())) {
			// System.out.println("더하기 버튼이 클릭되었습니다.");
			// 정의한 메서드 호출
			this.callbackBtnAction.clickedAddBtn();
		} else if(targetBtn.getText().equals(btnMinus.getText())) {
			this.callbackBtnAction.clickedMinusBtn();
		} else {
			this.callbackBtnAction.passValue(100);
		}
	}
}
