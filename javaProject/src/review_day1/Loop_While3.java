package review_day1;

import java.util.Random;
import java.util.Scanner;

public class Loop_While3 {

//	private static int count = 0;
//	private static int trueCount = 0;
//	
//	private static void gradeView() {
//		System.out.println("총 " + count + "문제 중 " + trueCount + "문제를 맞추셨습니다.");
//	}
	

	public static int randomGuGuDan() {
		int count = 0;
		Random ran = new Random();
		Scanner s = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {
			int x = ran.nextInt(8) + 2;
			int y = ran.nextInt(9) + 1;
			System.out.print(x + " * " + y + "= ");
			int ans = s.nextInt();
			count++;
			if (ans == (x * y)) {
				System.out.println("정답입니다");
				count++;
			} else {
				System.out.println("오답입니다. 정답은 " + (x * y) + "입니다.");
				
			}
		}
		int arr[] = {count, 3-count, 3}; // 첫번째 값은 정답개수, 두번째 값을 오답개수
		return arr; //리턴은 한 값만 가능하다
	}
	


	public static void gameUpAndDown() {
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		// 1~30 사이의 랜덤숫자 생성수 값 입력받아 몇번만에 맞추는지 출력 후 종료
		int num = ran.nextInt(30) + 1;

		int count = 0;
		while (true) {
			System.out.print("1~30 랜덤 숫자를 추측하시오: ");
			int input = s.nextInt();
			if (num > input) {
				System.out.println("UP");
				count++;
			} else if (num < input) {
				System.out.println("DOWN");
				count++;
			} else {
				count++;
				System.out.println(count + "번 만에 맞추셨습니다.");
				break;
			}
		}
	}

	public static void grandView() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner s = new Scanner(System.in);

		// 메뉴
		// 1을 선택하면 랜덤 구구단 3문제 출제
		// 2를 선택하면 up&down 게임
		// 1~2 이외 값을 선택하면 종료
		int correctCount = 0;
		int inCorrectCount = 0;
		int count = 0;
		while (true) {
			System.out.println("====메뉴====");
			System.out.println("(1) 랜덤 구구단 3문제, (2) up&down 게임, (3) 구구단 성적 조회, (그외): 종료");
			System.out.print("숫자를 입력하시오: ");
			int menu = s.nextInt();

			if (menu == 1) {
				int arr[] = randomGuGuDan();
				correctCount += arr[0];
				inCorrectCount += arr[1];
			} else if (menu == 2) {
				gameUpAndDown();
			} else if (menu == 3) {
				System.out.println("총 " + count + "문제 중 " + correctCount + "문제 맞추셨습니다.");
			} else {
				System.out.println("종료합니다");
				break;
			}

		}

	}

}
