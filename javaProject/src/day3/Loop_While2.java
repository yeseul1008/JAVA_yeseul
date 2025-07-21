package day3;

import java.util.Random;
import java.util.Scanner;

public class Loop_While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int i = 1;
//		while(true) {
//			System.out.println(i++);
//			if (i == 100) {
//				break; // 100이되는순간 (출력x) 와일문 빠져나감
//			}
//		}
		// 랜덤 구구단 문제 출력 (조건이 명확하지 않을 때 와일문 사용)
		// 계속해서 무한정 구구단문제를 풀다가 0을 쳐서 정지하는경우
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
//		System.out.println("랜덤 구구단 문제 풀이(0을 입력하면 종료됩니다.)");
//		while(true) {
//			int a = ran.nextInt(9)+1;
//			int b = ran.nextInt(9)+1;
//			System.out.print(a + " * " + b + " = ");
//			int ans = s.nextInt();
//			if(ans == a*b) {
//				System.out.println("정답입니다");
//			}else if(ans == 0) {
//				System.out.println("종료합니다");
//				break;
//			}
//			else {
//				System.out.println("오답입니다");
//			}
//		}

		// 5문제를 맞추면 5문제를 맞추셨습니다 출력후 종료
		System.out.println("랜덤 구구단 문제 풀이(0을 입력하면 종료됩니다.)");
		int count = 0;
		while (true) {
			int a = ran.nextInt(8) + 2;
			int b = ran.nextInt(9) + 1;
			System.out.print(a + " * " + b + " = ");
			int ans = s.nextInt();
			if(ans == a*b) {
				System.out.println("정답입니다");
				count++;
				if(count == 5) {
					System.out.println("5문제를 맞추어 종료합니다");
					break;
				}
			}else {
				System.out.println("틀렸습니다");
			}
		}
	}
}
