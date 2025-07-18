package day3;

import java.util.Random;
import java.util.Scanner;

public class Loop_Random2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 랜덤 구구단 문제 5문제 출제
		// 정답이면 정답출력 오답이면 오답 출력
		// 5문제를 다 푼 후에 한 문제당 20점으로 가정하고 채점
		
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		int score = 0;
		
		for(int i = 1; i <= 5; i++) {
			int x = ran.nextInt(8) + 2;
			int y = ran.nextInt(9) + 1;
			System.out.print(i + "번 : " + x + "*" + y + " "+ "= ");
			int answer = s.nextInt();
			if (answer == (x*y)) {
				score += 20;
				System.out.println("정답입니다");
			}else {
				System.out.println("오답입니다");
			}
		}
		System.out.println("총점: " + score);
		System.out.println("맞춘 개수: "+ score/20);
	} 

}
