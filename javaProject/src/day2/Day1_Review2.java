package day2;

public class Day1_Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 숫자 + 숫자 => 숫자
		// 숫자 + 문자 => 문자 (문자가 1개라도 있으면 결과는 문자로 나온다)
		String name = "홍길동";
		int age = 30;
		System.out.println(name + age);
		System.out.println(age + 5);
		System.out.println(name + age + 5);
		System.err.println(name + (age+5));
		// 홍길동30
		// 35
		// 홍길동305
		// 홍길동35
		
		// 정수와 정수의 계산 결과는 정수
		// 실수와 정수의 계산결과는 실수 (실수가 1개라도 있으면 결과는 실수)
		int num1 = 10;
		int num2 = 4;
		System.out.println(num1 / num2);
		System.out.println(num1 /(double) num2);
		double num3 = 4.0;
		System.out.println(num1 / num3);
		
		// % : 나눴을때 나머지 값을 리턴
		int num4 = 10;
		System.out.println(num4 % 2); //0
		System.out.println(num4 % 3); //1
		System.out.println(num4 % 4); //2
		
		
	}

}
