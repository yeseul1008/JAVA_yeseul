package day2;

import java.util.Scanner;

public class Switch_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("점수 입력: ");
		int score = s.nextInt();

		switch (score / 10) {
		case 10:
		case 9: // 스위치문은 조건에 맞지않더라도 브레이크가 없으면 계속 밑으로 실행됨
			System.out.println("A 학점");
			break;
		case 8:
			System.out.println("B 학점");
			break;
		case 7:
			System.out.println("C 학점");
			break;
		case 6:
			
			System.out.println("D 학점");
			break;
		default:
			System.out.println("F 학점");
			break;
		}
	}

}
