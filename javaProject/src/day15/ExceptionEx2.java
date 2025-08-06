package day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		try {
			System.out.print("숫자 입력 1 : ");
			int num1 = s.nextInt();
			System.out.print("숫자 입력 2 : ");
			int num2 = s.nextInt();
			System.out.println(num1/num2);
		} catch (Exception e) { // 이걸 이용하면 모든 예외를 처리할 수 있음
			// TODO: handle exception
			System.out.println("에러발생");
		} 
	}

}
