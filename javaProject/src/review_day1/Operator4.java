package review_day1;

import java.util.Scanner;

public class Operator4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 비교연산자
		// and => 둘 다 true이면 결과가 true
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		int num1 = 10;
		int num2 = 5;
		System.out.println(num1 > num2 && num1 % 2 ==0);
		System.out.println(num1 > 8 && num1 % 3 ==0);
		
		//or 둘 중 하나라도 true이면 결과가 true
		//둘다 false일때만 결과가 false
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		
		// 입력받은 숫자가 짝수이거나 3의 배수이면 true
		// 그렇지 않으면 false
		
		Scanner s = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int a = s.nextInt();
		if (a%2 == 0 || a%3==0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		// 그냥 이렇게 한 줄로 표현 가능
		System.out.println(a % 2 == 0 || a % 3 == 0);
	}

}
