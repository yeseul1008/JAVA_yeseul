package day4;

import java.util.Scanner;

public class Day3_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for, while, do~while
//		for(int i = 1; i <=30; i++) {
//			System.out.println(i);
//		}
//		int i = 1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		// 
		//보통 와일문은 무한루프를 사용할떄만 사용
		//사용자로부터 정수 5개 입력받고 0이하 수를 입력할경우 다시 입력하도록 유도
		Scanner s = new Scanner(System.in);
		int a = 0;
		while(true) {
			System.out.println("정수를 입력하시오: ");
			int num = s.nextInt();
			if (num>=1) {
				a++;
				if(a==5) {
					System.out.println("정수5개를 입력하셨습니다");
					break;
				}
			}
			else {
				System.out.println("1이상의 숫자를 입력해주세요");
			}
		}
	}

}
