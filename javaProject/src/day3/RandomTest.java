package day3;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		int score = 0;
		int real = 0;
		System.out.print("원하는 문제수를 입력해주세요 : ");
		int moon = s.nextInt();
		System.out.println(moon+"문제 풀이를 시작합니다. 정답에 0을 입력하면 종료됩니다.");
		for(int i = 1; i <= moon; i++) {
			int x = ran.nextInt(8) + 2;
			int y = ran.nextInt(9) + 1;
			System.out.print(i + "번 : " + x + "*" + y + " "+ "= ");
			int answer = s.nextInt();
			if (answer == (x*y)) {
				score ++;
				real++;
				System.out.println("정답입니다");
			}else if(answer == 0)
			{
				System.out.println("0을 입력하여 종료됩니다..");
				break;
			}
			else {
				System.out.println("오답입니다");
				real++;
			}
		}
		System.out.println("총 "+ real + "문제 중 " + score + "문제를 맞추셨습니다.");
	}

}
