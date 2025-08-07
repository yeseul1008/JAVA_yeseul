package day16;

import java.awt.Color;
import java.awt.Container;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame {

	public NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50); // 위치 선정
		la.setSize(200, 20);
		c.add(la);
		Random ran = new Random();
		for (int i = 1; i <= 9; i++) {
			JButton b = new JButton(i+""); // 버튼생성
			b.setLocation(i * 15, i * 15);
			b.setSize(50, 20);
			int a = ran.nextInt(255);
			b.setBackground(new Color(ran.nextInt(255), ran.nextInt(255), ran.nextInt(255)));
			c.add(b); // 버튼을컨텐트팬에부착
		}
		setSize(300, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NullContainerEx();
	}
}
