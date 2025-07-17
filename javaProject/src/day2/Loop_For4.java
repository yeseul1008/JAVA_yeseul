package day2;

import java.util.Scanner;

public class Loop_For4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자를 하나 입력받아 해당 숫자의 구구단을 출력하기
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("원하는 숫자를 입력 : ");
		int dan = s.nextInt();
		
		for (int i = 9; i>=1; i-- ) { // 규칙을 파악하는게 중요 * 뒤 숫자가 바뀌니까 거기를 변수로 선언하기
			System.out.println(dan + " * " + i + " = " + (dan*i) );
		}
	}

}
