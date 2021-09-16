package ch06;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainTest {

	public static void main(String[] args) {
		new MiniAmongus();
	}

}

class MiniAmongus extends JFrame {

	BufferedImage backgroundImage;
	BufferedImage amongImage1;
	BufferedImage amongImage2;
	CustomJPanel customJPanel;

	int among1XPoint = 0;
	int among1YPoint = 370;
	int among2XPoint = 200;
	int among2YPoint = 200;

	public MiniAmongus() {
		initData();
		setInitLayout();
		addEventListener();
		Thread thread = new Thread(customJPanel);
		thread.start();
	}

	private void initData() {
		setTitle("미니 어몽어스");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		try {
			backgroundImage = ImageIO.read(new File("background2.jpg"));
			amongImage1 = ImageIO.read(new File("among1.png"));
			amongImage2 = ImageIO.read(new File("among2.png"));
			System.out.println("파일을 정상적으로 가지고 왔습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		customJPanel = new CustomJPanel();
	}

	private void setInitLayout() {
		setVisible(true);
		add(customJPanel);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				switch (code) {
				case KeyEvent.VK_UP:
					System.out.println("위");
					among2YPoint -= 10;
					break;

				case KeyEvent.VK_DOWN:
					System.out.println("아래");
					among2YPoint += 10;
					break;

				case KeyEvent.VK_LEFT:
					System.out.println("왼쪽");
					among2XPoint -= 10;
					break;

				case KeyEvent.VK_RIGHT:
					System.out.println("오른쪽");
					among2XPoint += 10;
					break;
				}
				repaint();
			}
		});
	}

	private class CustomJPanel extends JPanel implements Runnable {
		@Override
		public void paintComponent(Graphics g) {
			g.drawImage(backgroundImage, 0, 0, 600, 600, null);
			g.drawImage(amongImage1, among1XPoint, among1YPoint, 100, 100, null);
			g.drawImage(amongImage2, among2XPoint, among2YPoint, 100, 100, null);
		}

		@Override
		public void run() {
			boolean direcation = true;
			while (true) {

				if (direcation) {
					among1XPoint = among1XPoint + 10;
				} else {
					among1XPoint = among1XPoint - 10;
				}

				if (among1XPoint == 400) {
					direcation = false;
				}

				if (among1XPoint == 0) {
					direcation = true;
				}

				repaint();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if (among1XPoint == among2XPoint & among1YPoint == among2YPoint) {
					amongImage1 = null;
					amongImage2 = null;
				}

			}

		}
	}
}