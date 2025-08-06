package day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("숫자 입력 1 : "); //실질적으로 10\n 이런식으로 버퍼에 감
				int num1 = s.nextInt();
				System.out.print("숫자 입력 2 : ");
				int num2 = s.nextInt();
				System.out.println(num1 / num2);
				break;
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("0으로 나눌 수 없음");
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("값 제대로 입력하셈");
				s.nextLine(); // \n을 넘기는 용도
				
			} catch (Exception e) { /// 이셉션과 위 코드랑 잘 섞어 쓰는것이좋다.
				// TODO: handle exception
				System.out.println(e.getMessage());
				System.out.println("예상치 못한 에러 발생");
			}
		}
	}

}
