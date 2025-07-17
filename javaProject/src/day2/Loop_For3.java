package day2;

public class Loop_For3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 100까지 중에서 홀수들의 합을 출력
		int sum = 0;
		for(int i = 1; i <=100; i ++) {
			if(i%2 != 0) { //i%2 == 1
				sum += i;
			}
		}
		System.out.println("1부터 100까지 수 중 홀수들의 합은 " + sum);
	}
	
//		for(int i = 1; i <=100; i += 2) { 이것도 가능
//				sum += i;
//		}
}
