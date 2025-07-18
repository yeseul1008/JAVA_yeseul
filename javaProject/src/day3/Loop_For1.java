package day3;

import java.util.Scanner;

public class Loop_For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		// 숫자를 5번 입력받아 해당 숫자들의 합 출력
		//조건1. 음수가 들어오면 숫자를 다시입력하도록
		//조건2. 0을 입력하면 더이상 입력받지 않고 바로 총합을 구함
		int sum = 0;
		for(int i = 1; i <=5; i++) {
			System.out.print(i + "번째 숫자 입력 :");
			int num = s.nextInt();
			if(num < 0 ) {
				System.out.println("음수는 불가능합니다 다시입력해주세요.");
				i--;
				continue; // 반복문for 내부에서 컨티뉴가 있으면 아래 코드를 무시하고 바로 for 증감식으로 이동
			} 
			else if(num ==0) {
				System.out.println("0을 입력하였으므로 종료합니다.");
				break;// 반복문for 내부에서 브레이크가 있으면 아래 코드를 무시하고 바로 for문 자체를 빠져나온다
			}
				sum += num;
		}
		System.out.println("숫자들의 총 합은" + sum);
	}

}
