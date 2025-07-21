package day4;

import java.util.Random;
import java.util.Scanner;

public class Day3_Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1~10사이의 랜덤숫자 생성
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		int num = ran.nextInt(10)+1;
		int count = 0;
		//for문에서 무한루프를 사용하려면 (;;)를 사용하면 된다.(while의 true와 같은)
		for(;;) {
			System.out.print("숫자입력: ");
			int input = s.nextInt();
			count++;
			if (input < num) {
				System.out.println("up");
				
			}else if (input > num) {
				System.out.println("down");
				
			}else {
				
				System.out.println(count+"번 만에 맞추셨습니다.");
				break;
			}
		}
	}

}
