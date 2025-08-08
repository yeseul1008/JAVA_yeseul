package day16;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonymousClassListener extends JFrame{ // 컨테이너 상속
	public AnonymousClassListener() { // 생성자로 동작
		 setTitle("Action 이벤트 리스너 작성");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 Container c = getContentPane();
		 c.setLayout(new FlowLayout());
		 JButton btn = new JButton("Action"); //btn이라는 이름의 버튼 생성 → 초기 텍스트는 "Action"
		 c.add(btn); //생성된 버튼을 컨테이너(c)에 추가
		
		 
		 btn.addActionListener(new ActionListener() {
			//btn 클릭할때 밑 코드가 실행됨
			@Override
			public void actionPerformed(ActionEvent e) { //e: 이벤트가 발생할때 생성되는 객체
				// TODO Auto-generated method stub
				JButton eventBtn = (JButton)e.getSource(); //발생한 버튼 객체 가져오기
				System.out.println(eventBtn.getText());
				if (eventBtn.getText().equals("Action")) {
					eventBtn.setText("액션");
				}else {
					eventBtn.setText("Action");
				}
				
			}
		});
		 JButton bgCl = new JButton("배경색 변경");
		 c.add(bgCl); //컨테이너에 부착
		 Random ran = new Random();
		 bgCl.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
//				JButton eventCl = (JButton)e.getSource();
				c.setBackground(new Color(ran.nextInt(256), ran.nextInt(256), ran.nextInt(256)));
			}
		});
		 
		 setSize(350, 150);
		 setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new AnonymousClassListener();
	}

}
