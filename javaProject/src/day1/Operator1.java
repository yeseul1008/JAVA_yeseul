package day1;

public class Operator1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2= 3;
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		// 정수와 정수의 계산결과 -> 정수
		// 수를 계산 할 때 하나라도 실수(소수점)가 있다면 결과는 무조건 실수 
		
		System.out.println((double) num1 / num2);
		
		int num3 = 10;
		double num4= 3;
		System.out.println(num3 / num4);
		
		
	}

}
