package quiz;

import java.util.Random;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// * 기본 절차 설명
//		ㅇ  - 최초에는 메뉴 선택 텍스트 출력
//		ㅇ  - 1을 입력할 경우 문제 풀이로 이동. 랜덤 구구단 문제 출제
//		 ㅇ - 문제를 맞추거나 틀림에 따라 상황에 맞는 텍스트 출력
//		 ㅇ - 정답에 0을 입력할 경우 메뉴 선택으로 이동
//		  - 2를 누를경우 그동안 풀이 했던 문제의 정답 및 오답 개수 출력 후 메뉴 선택으로 이동
//		  - 1~3외의 값을 입력할 경우 '1~3중 선택해 주세요' 텍스트 출력 후 메뉴 선택으로 이동
//		  - 3을 누르면 '종료되었습니다' 출력 후 종료

		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		int cor = 0;
		int no = 0;
		System.out.println("******랜덤 구구단 문제******");
		while (true) {
			System.out.println("=======메뉴선택=======");
			System.out.print("[ (1)문제 풀이 (2)현재스코어 (3)종료 ] : ");
			int menu = s.nextInt();
			if (menu == 1) {
				
				System.out.println("문제풀이를 선택하셨습니다. 정답에 0을 입력하면 메뉴로 이동합니다");
				while (true) {
					int a = ran.nextInt(7) + 2;
					int b = ran.nextInt(8) + 1;
					System.out.print(a + " * " + b + " = ");
					int ans = s.nextInt();
					if (ans == a * b) {
						System.out.println("정답입니다!");
						cor++;
					} else if (ans == 0) {
						System.out.println("0을 입력하셨으므로 메뉴로 이동합니다.");
						break;
					} else {
						System.out.println("오답입니다! 정답은"+(a*b)+"입니다.");
						no++;
					}
				}
			}else if(menu == 2) {
				System.out.println("현재까지 맞춘 정답 개수: "+cor);
				System.out.println("현재까지 틀린 오답 개수: "+no);
			}else if(menu == 3) {
				System.out.println("종료되었습니다.");
				break;
			}else {
				System.out.println("1~3중 선택해 주세요.");
			}
		}
	}

}
