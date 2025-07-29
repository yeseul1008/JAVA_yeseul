package review_day1;

import java.util.Random;
import java.util.Scanner;

public class Loop_For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 100번동안 랜덤 숫자 갱신해가면서
		// 50이라는 숫자가 몇번째 나오는지
		// 만약 100번 안에 나오면 00번째에 50을 찾았습니다
		// 그렇지 않으면 100번안에 50이 나오지 않았습니다
		
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		
		int i;
		for(i=1; i<=100; i++) {
			int b = ran.nextInt(50)+1;
			System.out.println(b);
			if(b==50) {
				System.out.println(i+"번째에 50을 찾았습니다.");
				break;
			}
		}
		
		if(i >= 100) {
			System.out.println("100번안에 50이 나오지 않았습니다.");
		}
	}

}
