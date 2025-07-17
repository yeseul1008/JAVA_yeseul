package day2;

public class Operator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 대입 연산자
		int num1 = 10;
		num1 = num1 + 5;
		System.out.println(num1);
		
		// 자신의 수에 변화를 줄 때 사용 num2 = num1 + 5; 의 경우는 저대로 하는게 맞음
		int num2 = 10;
		num2 += 5; // num2 = num2 + 5; 와 같은 의미
		System.out.println(num2);
		
		int num3 = 10;
		num3 -= 3; // num3 = num3 - 3 ; 와 같은 의미
		System.out.println(num3);
	}

}
