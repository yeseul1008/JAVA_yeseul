package day2;

public class Operator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 논리연산자
		// not, or(||), and(&&)
		// not은 !. or 은 둘 중 하나라도 만족시 true. and 둘 다 만족해야 true
		System.out.println(true || true); //true 출력
		System.out.println(true || false); //true 출력
		System.out.println(false || false); //false 출력
		System.out.println(true && true); //true 출력
		System.out.println(true && false); //false 출력
		System.out.println(false && false); //false 출력
		
		int num1 = 5;
		int num2 = 10;
		System.out.println(num1 > 8 || num2 > 8);// true 출력
		System.out.println(num1 > 8 && num2 > 8);// false 출력

	}

}
