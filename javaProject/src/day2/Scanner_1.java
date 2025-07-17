package day2;

import java.util.Scanner;

public class Scanner_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컨트롤 쉬프트 O -> 자동으로 됨
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요:");
		int num1 = s.nextInt();
		System.out.print("이름을 입력해 주세요:");
		String name = s.next();
		
		System.out.println("입력한 숫자 :" + num1);
		System.out.println("입력한 이름 :" + name);
		// System.out.print -> ln이 없으면 줄바꿈 안함
	}
	// s 객체에서 nextInt메소드를 가져옴

}
