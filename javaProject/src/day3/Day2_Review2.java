package day3;

import java.util.Scanner;

public class Day2_Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 조건문
		// 단순 [if], [if ~ else], [if ~ else if ~ else], [중첩 if]
		
		// 괄호안에 결과가 참이거나 거짓인 구별되는 "조건식"이 들어가야함
		
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int num1 = s.nextInt();
//		int num1 = 30;
		
//		if(num1 > 20) {
//			System.out.println("20보다 큽니다.");
//		}
		
		if(num1 > 20) {
			System.out.println("20보다 큽니다.");
		}
		else {
			System.out.println("20이하의 숫자입니다");
		}
	
	}
	

}
