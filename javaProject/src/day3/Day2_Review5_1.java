package day3;

import java.util.Scanner;

public class Day2_Review5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int i = s.nextInt();
		
		if (i%2 == 0) {
			System.out.println(i + "는 짝수입니다");
		}
		else {
			System.out.println(i + "는 홀수입니다");
		}
	}

}
