package day2;

public class Operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 비교연산자
		// 크다 ,작다, 같다, 다르다
//		10 > 20 => false
//		30 > 5 => true
		int num1 =10;
		int num2 =5;
		System.out.println(num1 > 8); // true
		System.out.println(num1 < num2); // false
		System.out.println(num2 > 5); //false
		System.out.println(num2 >= 5); //true
		System.out.println(num1 <= 10); //true
		
//		System.out.println(num1 = num2); 이렇게 하면 num2값을 num1에 넣어서 5가 출력됨
		System.out.println(num1 == num2); //false
		System.out.println(num1 == 10); //true
		
		// 부정의 의미 ! 느낌표
		
		System.out.println(num1 != num2); // true //넘1과 넘2가 다른지 물음
		System.out.println(num1 != 10); //false
		
		System.out.println(true); //true 출력
		System.out.println(!true); //false 출력
		
		System.out.println(!(num1 == num2)); // false에 !가 붙어서 true로 나온다
	}
	

}
