package day15;

import java.util.Scanner;

public class ScannerNextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너 next()와 nextLine()
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 입력 1 : ");
		int num1 = s.nextInt(); //10\n 실질적으로 이렇게 담김
		System.out.println("문자 입력 :");
		String str = s.nextLine(); // \n을 만나면 \n을 받고 바로 다음구문으로 넘어감
		System.out.print("숫자 입력 2 : ");
		int num2 = s.nextInt();
	}

}
