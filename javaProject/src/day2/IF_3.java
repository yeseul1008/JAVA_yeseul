package day2;

import java.util.Scanner;

public class IF_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		// 나이를 입력받아서 나이에 따라 성인인지 아닌지 구분
		System.out.print("나이를 입력해주세요 : ");
		int age = s.nextInt();
		
		System.out.println("입력한 나이 : " + age);
		
		if (age>=19) {
			System.out.println("성인입니다.");
		}
		else {
			System.out.println("성인이 아닙니다.");
		}
		
		s.close(); // 스케너 상태 종료
	}

}
