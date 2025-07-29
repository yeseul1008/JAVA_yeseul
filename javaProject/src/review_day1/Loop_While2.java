package review_day1;

import java.util.Random;

public class Loop_While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 랜덤 숫자(1~100)를 지속적으로 출력하는데 50을 출력하는 순간 바로 종료
		// 
		//" 50을 출력 후 50을 만나 종료되었습니다"
		
		Random ran = new Random();
		int count = 0;
		
		while(true) {
			int num = ran.nextInt(100)+1;
			count++;
			if (num == 50) {
				System.out.println(count + "번 만에 50을 출력 후 종료되었습니다");
				break;
			}
			System.out.println(num);
			
		}
		
		
	}

}
