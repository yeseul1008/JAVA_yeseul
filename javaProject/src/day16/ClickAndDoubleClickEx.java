package day16;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class ClickAndDoubleClickEx extends JFrame {

	public ClickAndDoubleClickEx() {
		setTitle("Click and DoubleClick 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MouseAdapter() { //어댑터로 메소드 하나만 불러오기

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if (e.getClickCount() == 2) {
					int r = (int) (Math.random() * 256);
					int g = (int) (Math.random() * 256);
					int b = (int) (Math.random() * 256);
					Component c = (Component) e.getSource();
					c.setBackground(new Color(r, b, g));
				}
			}

		});
		setSize(300, 200);

		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClickAndDoubleClickEx();
	}

}
