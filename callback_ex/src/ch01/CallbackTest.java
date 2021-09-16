package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class CallbackTest {

	public static void main(String[] args) {
		MainActivity mainActivity = new  MainActivity();
		new SubActivity(mainActivity);

	}

}

interface CallbackBtnAction {
	void clickedAddBtn();
	void clickedMinusBtn();
	// �Ű������� �� ����(�⺻������ Ÿ��, object)
	void passValue(int value);
	
}

// �ݹ� �޴� ��ü : CallbackBtnaction �������̽��� �����ؼ� �޼��带 ����Ѵ�.
class MainActivity extends JFrame implements CallbackBtnAction {

	int count;
	JLabel label;

	public MainActivity() {
		count = 0;
		label = new JLabel(count + "");
		setSize(300, 300);
		setLayout(new FlowLayout());
		add(label);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void clickedAddBtn() {
		System.out.println("+��ư �ݹ� �޾ҽ��ϴ�.");
		count++;
		label.setText(count + "");
	}

	@Override
	public void clickedMinusBtn() {
		System.out.println("-��ư �ݹ� �޾ҽ��ϴ�.");
		count--;
		label.setText(count + "");		
	}
	
	@Override
	public void passValue(int value) {
		label.setText("�Ű� ������ �� ���� ���� :" + value);
	}
}

// �ݸ�(ȣ����) : �ݹ� �޴� ��ü�� �ּҰ��� �˰� �־�� ��� ������ ����Ǿ��ٰ� �˸� �� �ִ�.
class SubActivity extends JFrame implements ActionListener {

	JButton btnAdd;
	JButton btnMinus;
	JButton btnpassValue;
	// ��ư �����
	CallbackBtnAction callbackBtnAction;
	
	public SubActivity(CallbackBtnAction callbackBtnAction) {
		this.callbackBtnAction = callbackBtnAction;
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		btnAdd = new JButton("���ϱ� ��ư");
		btnMinus = new JButton("���̳ʽ� ��ư");
		btnpassValue = new JButton("�� �����ϱ�");
		
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
			// System.out.println("���ϱ� ��ư�� Ŭ���Ǿ����ϴ�.");
			// ������ �޼��� ȣ��
			this.callbackBtnAction.clickedAddBtn();
		} else if(targetBtn.getText().equals(btnMinus.getText())) {
			this.callbackBtnAction.clickedMinusBtn();
		} else {
			this.callbackBtnAction.passValue(100);
		}
	}
	
}
