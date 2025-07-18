package day3;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner s = new Scanner(System.in);

		System.out.println("Up & Down Game Start");
		int random = ran.nextInt(100) + 1;
		int count = 0;
		while (true) {
			System.out.print("숫자를 입력하시오: ");
			int answer = s.nextInt();
			if (answer >= 1 && answer <= 100) {
				count++;
				if (random > answer) {
					System.out.println("Up");
				} else if (random < answer) {
					System.out.println("Down");
				} else {
					System.out.println("정답입니다.");
					break;
				}
			} else {
				System.out.println("잘못입력했습니다.1~100값으로 다시입력해주세요");
			}
		}
		System.out.println(count + "번 만에 맞췄습니다.");
	}

}
