package quizEx;

import java.util.HashMap;
import java.util.Scanner;

public class FruitMarket {

	public static int checkNumber(String msg) {

		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println(msg + " :");
			int input = s.nextInt();

			if (msg.equals("가격")) {
				if (input % 100 == 0) {
					
				} else {
					System.out.println("100단위로 입력하시오");
					continue;
				}
			} else {

				if (input <= 0) {
					System.out.println("음수는 불가능합니다. 다시입력하세요");

				} else {
					break;
				}

			}

		} return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// * 과일가게 프로그램 *
		// 메뉴 1(추가). 과일명, 가격, 개수 추가(map)한 후 list에 담기
		// 메뉴 2(확인). 과일명을 입력받고, 해당 과일명의 가격, 개수 출력
		// 만약 없는 과일명이면 '해당 과일이 존재하지 않습니다' 출력
		// 메뉴 3(판매). 과일명과 개수를 입력받아서 해당 과일명의 개수에서 차감
		// 'oo개가 판매되었습니다.' 출력
		// 만약 없는 과일명이면 '해당 과일이 존재하지 않습니다' 출력
		// checkNumber 메소드 : - 가격, 개수에 음수 입력 불가능하도록
		// 가격은 100단위(1500 ok, 1310 x)
		// 판매 개수가 원래 개수보다 많을 경우
		// '판매 가능한 개수는 oo개 입니다' 출력 후 메뉴로 이동
		// 1번메뉴에서 과일을 추가할 때,
		// 이미 있는 과일이면 가격을 물어보지 말고
		// 개수만 물어본 후 해당 개수를 기존개수에 더하기
		// 메뉴 -1(종료). '종료되었습니다' 출력 후 프로그램 종료
		// 메뉴 4번 추가(메뉴명 : 가격 수정)
		// 과일명을 입력받고 가격을 수정할 수 있도록
		// ex) 사과 입력 후 수정할 가격 2000을 입력하면
		// 사과의 가격(price)이 2000으로 변경

		System.out.println("======과일가게 프로그램======");
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("[ (1)추가 (2)확인 (3)판매 (4)가격 수정 (-1)종료 ] : ");
			int menu = s.nextInt();
			if (menu == 1) {
				HashMap<String, Object> map = new HashMap<String, Object>();
				System.out.print("과일이름 입력: ");
				String fruitName = s.next();
				System.out.print("과일가격 입력: ");
				int fruitPrice = s.nextInt();
				System.out.print("과일개수 입력: ");
				int fruitcount = s.nextInt();
			}

		}

	}

}
