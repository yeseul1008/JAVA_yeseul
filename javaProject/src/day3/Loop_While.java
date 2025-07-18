package day3;

import java.util.Scanner;

public class Loop_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for문은 ()안에 선언,조건,증감 이 들어가는 반면
		//while은 ()안에 조건만 들어감, 미리 선언하기, while안에 증감식 넣기
		
//		int i = 0;
//		while(i<10) {
//			System.out.println(i);
//			i++; //증감은 내부에서 진행
//		}
		
		//1. 1부터 사용자가 입력한 숫자가까지 합 구하기 와일 이용
		//2. 구구단짜기
//		Scanner s = new Scanner(System.in);
//		int i = 1;
//		int sum = 0;
//		System.out.print("숫자를 입력하시오: ");
//		int end = s.nextInt();
//		while(i<=end) {
//			sum = sum + i;
//			i++;
//		}
//		System.out.println("총합은 " + sum);
		
		int i = 2;
		while(i<=9) {
			int j = 1; // 선언 위치 중요
			System.out.println("====="+i+"단=====");
			while(j<=9) {
				System.out.println(i + " * " + j + " = " + i*j);
				j++;
			}
			i++;
		}
	}

}
