package day16;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Quiz1 extends JFrame {

	public Quiz1() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		Random ran = new Random();
		
		for (int i = 1; i <= 10; i++) {
			JButton btn = new JButton(i + "번 버튼"); // btn 객체 생성
			btn.addActionListener(new ActionListener() {// btn객체에 액션 추가
				
				@Override
				public void actionPerformed(ActionEvent e) { //액션이 발생했을때
					// TODO Auto-generated method stub
					btn.setBackground(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256)));
					
				}
			});
			c.add(btn);
		}

		
		setSize(300, 200);
		setVisible(true);



	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Quiz1();
	}

}
