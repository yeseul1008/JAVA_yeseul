package quizEx;

public class Num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. 1부터 50까지 숫자 중 짝수이거나 5의 배수인 숫자를 출력하시오.
//		 조건 1. 반복문과 조건문을 사용할 것
		
		for (int i = 1; i<=50; i++) {
			if (i % 2 == 0 || i % 5 ==0) {
				System.out.println(i);
			}
		}
		
	}

}
