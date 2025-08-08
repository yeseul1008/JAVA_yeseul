package day16;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlyingTextEx extends JFrame {
	private final int FLYING_UNIT = 10;
	private JLabel la = new JLabel("HELLO");

	public FlyingTextEx() {
		setTitle("상,하,좌,우키를이용하여텍스트움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int key = e.getKeyCode();
				if (key == KeyEvent.VK_RIGHT) {
					la.setLocation(la.getX() + FLYING_UNIT, la.getY()); // x축으로 10만큼이동, y축 그대로
				} else if (key == KeyEvent.VK_LEFT) {
					la.setLocation(la.getX() - FLYING_UNIT, la.getY());
				} else if (key == KeyEvent.VK_UP) {
					la.setLocation(la.getX(), la.getY() - FLYING_UNIT);
				} else if (key == KeyEvent.VK_DOWN) {
					la.setLocation(la.getX(), la.getY() + FLYING_UNIT);
				}
			}

		});

		la.setLocation(50, 50);
		la.setSize(100, 20);
		c.add(la);
		setSize(300, 300);
		setVisible(true);
		c.setFocusable(true); // 포커스
		c.requestFocus();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlyingTextEx();
	}

}
