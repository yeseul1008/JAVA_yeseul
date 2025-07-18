package day3;

import java.util.Scanner;

public class Loop_For4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 9단 -> 2단
//		for(int i = 9; i >=2; i--) {
//			System.out.println("=====" + i +"단=====");
//			for(int j = 9; j >=1; j--) {
//				System.out.println(i + " * " + j + " = " + i*j);
//			}
//		}
		
		// 숫자 하나를 입력받아서 해당 숫자만큼 늘어나는 별찍기
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하시오: ");
		int star = s.nextInt();
		
		for(int i = 1; i<=star; i++) {
			
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
				
			}
			System.out.println(); // 줄바꿈용
		}
	}

}
