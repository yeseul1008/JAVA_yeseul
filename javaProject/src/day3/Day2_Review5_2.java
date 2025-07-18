package day3;

import java.util.Scanner;

public class Day2_Review5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 숫자를 하나 입력받아 홀수면 홀수, 짝수면 짝수 출력
		// 2. 숫자를 5번 입력받아 해당 숫자들의 합을 출력
		// 3. 숫자를 5번 입력받아서 입력받은 수 중 가장 큰 수 출력
		
		Scanner s = new Scanner(System.in);
		
		// TODO 두번째 문제
		int sum = 0;
		for(int i = 1; i <=5; i++) {
			System.out.print(i + "번째 숫자 입력 :");
			int num = s.nextInt();
			sum += num;
		}
		System.out.println("숫자들의 총 합은" + sum);
		
//		System.out.print("첫번째 숫자를 입력하시오 : ");
//		int a = s.nextInt();
//		System.out.print("두번째 숫자를 입력하시오 : ");
//		int b = s.nextInt();
//		System.out.print("세번째 숫자를 입력하시오 : ");
//		int c = s.nextInt();
//		System.out.print("네번째 숫자를 입력하시오 : ");
//		int d = s.nextInt();
//		System.out.print("다섯째 숫자를 입력하시오 : ");
//		int e = s.nextInt();
//		
//		System.out.println("숫자들의 총 합은" + (a + b + c + d + e) + "입니다.");
//	}
}}

		
	
