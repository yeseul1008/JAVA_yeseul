package exam0807;

import java.util.Random;
import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 구구단 문제를 랜덤으로 생성하여 출력하고 사용자로부터 답을 입력 받으시오. (20점)
//		조건 1. 사용자로부터 몇문제를 풀지 입력 받은 후 해당 수 만큼 문제를 출력한다.
//		단, 문제 수는 최소 3, 최대 10문제로 제한한다. o
//		조건 2. 모든 문제를 풀이한 후 맞은 개수가 더 많을 경우 '통과 입니다' 출력 후 종료한다. o
//		조건 3. 틀린 개수가 더 많거나 맞은 개수와 동일할 경우 '재도전 하시겠습니까? 출력 후 
//		'네'를 입력하면 조건 1부터 다시 시작, 그 외의 값을 입력하면 종료한다. 0
//		조건 4. 위에서 정의한 문구외의 다른 문구는 자유롭게 정의한다.

		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		boolean flg = true;
		
		while (true) {
			int QuizNum = 0;
			while (flg) {
				System.out.print("문제 수 입력 :");
				QuizNum = s.nextInt();
				if (QuizNum < 3 || QuizNum > 10) {
					System.out.println("문제 수는 최소 3, 최대 10문제로 입력하세요 :");
				} else {
					flg = false;
				}
			}
			int cor = 0;
			int fal = 0;

			for (int i = 1; i <= QuizNum; i++) {
				int A = ran.nextInt(8) + 2;
				int B = ran.nextInt(9) + 1;
				System.out.print(A + " * " + B + " = ");
				int ans = s.nextInt();
				if (ans == A * B) {
					System.out.println("정답");
					cor++;
				} else {
					System.out.println("오답");
					fal++;
				}
			}
			if (cor > fal) {
				System.out.println("과반 수 이상 맞추었으므로 통과입니다.");
				break;
			} else {
				System.out.print("재도전 하시겠습니까?(네: 재도전 / 그 외: 종료) :");
				String retry = s.next();
				if (retry.equals("네")) {
					flg = true;
					
				} else {
					System.out.println("종료합니다.");
					break;
				}
			}
		}
	}
}
