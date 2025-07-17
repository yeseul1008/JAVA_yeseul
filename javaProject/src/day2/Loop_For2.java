package day2;

import java.util.Scanner;

public class Loop_For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int sum = 0; //합을 보관해 둘 변수
//		for (int i =1; i <= 10; i++) {
//			sum = sum + i;
//			// sum += i; 와 같다
//		}
//		System.out.println(sum);
		
		// 숫자를 한개 입력받고 1부터 입력받은 수 까지 모두 더하기
		
		//오름차순 방법
//		Scanner s = new Scanner(System.in);
//		int sum = 0;
//		System.out.print("숫자를 입력하시오 : ");
//		int j = s.nextInt();
//		for (int i = 1; i <= j; i++ ){
//			sum += i;
//		}
//		System.out.println(sum);
		
		
		// 내림차순 방법
		Scanner s = new Scanner(System.in);
		int sum = 0;
		System.out.print("숫자를 입력하시오 : ");
		int j = s.nextInt();
		for (int i = j; i >= 1; i-- ){
			sum += i;
		}
		System.out.println(sum);
	
	}

}
