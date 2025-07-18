package day3;

import java.util.Scanner;

public class Day2_Review5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		//TODO 세번째 문제
		// 3. 숫자를 5번 입력받아서 입력받은 수 중 가장 큰 수 출력
		// 양수만 입력한다 가정
		int max = 0;
		for(int i = 1; i <=5; i++) {
			System.out.print(i + "번째 숫자 입력 :");
			int input = s.nextInt();
			if(input > max) {
				max = input;
			} // 꼭 else를 쓸 필요가 없음
		}
		System.out.println("가장 큰 수는" + max);
		
		
		
		
		
		
//		System.out.print("첫번째 숫자를 입력하시오 : ");
//		int a = s.nextInt();
//		System.out.print("두번째 숫자를 입력하시오 : ");
//		int b = s.nextInt();
//		System.out.print("세번째 숫자를 입력하시오 : ");
//		int c = s.nextInt();
//		System.out.print("네번째 숫자를 입력하시오 : ");
//		int d = s.nextInt();
//		System.out.print("다섯번째 숫자를 입력하시오 : ");
//		int e = s.nextInt();
//		
//		if (a>b) {
//			if (a>c) {
//				if(a>d) {
//					if(a>e) {
//						System.out.println("입력한 숫자 중 가장 큰 수 : " + a);}
//				}
//			}
//		}
//		else if (b>a) {
//			if (b>c) {
//				if(b>d) {
//					if(b>e) {
//						
//						System.out.println("입력한 숫자 중 가장 큰 수 : " + b);}
//				}
//			}
//		}
//		else if (c>a) {
//			if (c>b) {
//				if(c>d) {
//					if(c>e) {
//						System.out.println("입력한 숫자 중 가장 큰 수 : " + c);}
//				}}}
//		else if (d>a) {
//			if (d>b) {
//				if(d>c) {
//					if(d>e) {
//						System.out.println("입력한 숫자 중 가장 큰 수 : " + d);}
//				}}}
//		else if (e>a) {
//			if (e>b) {
//				if(e>c) {
//					if(e>d) {
//						System.out.println("입력한 숫자 중 가장 큰 수 : " + e);}
//				}}}
				
	}

	}


