package day15;

import java.util.Random;
import java.util.Scanner;

public class Gugu {

//	3. 구구단 문제를 랜덤으로 생성하여 출력하고 사용자로부터 답을 입력 받으시오.
//	 조건 1. 기본적으로 랜덤 문제를 5번 제공한다.
//	 조건 2. 5문제 중 3문제 이상 정답을 맞췄을 경우 종료한다.
//	 조건 3. 5문제 중 3문제 이상 틀렸을 경우 위 과정을 다시 반복 한다.
//	 조건 4. print문으로 출력하는 문구는 자유롭게 정의한다.

	public static void main(String[] args) {
		System.out.println("=====랜덤구구단 문제=====");
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		int cor = 0;
		int fal = 0;
		for (int i = 0; i < 5; i++) {
			int a = ran.nextInt(8) + 2;
			int b = ran.nextInt(9) + 1;
			System.out.print(a + " * " + b + " = ");
			int ans = s.nextInt();
			if(ans == a*b) {
				System.out.println("정답");
				cor++;
			}else {
				System.out.println("오답");
				fal++;
			}
			if(cor >= 3) {
				System.out.println("3문제를 맞췄으므로 종료합니다.");
				break;
			}else if(fal>=3) {
				System.out.println("3문제 이상 틀리셨습니다. 랜덤 5문제 다시 제공");
				cor = 0;
				fal = 0;
				i = 0;
			}
		}
		
		

	}

}
