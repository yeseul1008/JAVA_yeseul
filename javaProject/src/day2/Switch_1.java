package day2;

import java.util.Scanner;

public class Switch_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~6 사이 값을 입력받아서 입력한 수 + "학년 입니다."
		Scanner s = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int num = s.nextInt();
		switch (num) { // swith문은 if문 처럼 바로빠져나가지않음 - >빠져나가려면 break문이 필요
			case 1:
				System.out.println("1학년은 30점 이상합격");
				break;
			case 2:
				System.out.println("2학년은 40점 이상합격");
				break;
			case 3:
				System.out.println("3학년은 50점 이상합격");
				break;
			case 4:
				System.out.println("4학년은 60점 이상합격");
				break;
			case 5:
				System.out.println("5학년은 70점 이상합격");
				break;
			case 6:
				System.out.println("6학학년은 80점 이상합격");
				break;
		default: // if문 else와 같은 역할
			System.out.println("잘못입력하셨습니다");
		}

	}

}
