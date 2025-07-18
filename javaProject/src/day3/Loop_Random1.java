package day3;

import java.util.Random;
import java.util.Scanner;

public class Loop_Random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 랜덤한 구구단 문제를 출제
		// 맞췄을 때 점수부여, 맞춘개수 판단
		// Math 클래스 방법, Random 클래스 방법
		Random ran = new Random(); //
	// int a = 10; 이런느낌
	//랜덤이라는 데이터 타입에 ran이라는 변수를 만들고 new로 생성한 Random을 넣는것
	
//		int x = ran.nextInt();
//		System.out.println(x); // 기본 : -21억~21억
//		int y = ran.nextInt(10); // 범위 설정 : 0 ~ 9 [10개] 0부터 시작함!
//		System.out.println(y);   //                       0~(내가넣은수-1)
		// int y = ran.nextInt(10) + 1; <- 1부터 시작하고싶은 경우 (1~10)
		int z = ran.nextInt(2,10); // 2~9 출력
//		int z = ran.nextInt(8)+2; //2~9 출력
		int q = ran.nextInt(9)+1;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("랜덤 구구단 문제");
		System.out.print( z + " * " + q + " = ");
		
		int dap = s.nextInt();
		if (dap == (z * q)) {
			System.out.println("정답입니다");
		}
		else {
			System.out.println("틀렸습니다");
		}
		
	}

}
