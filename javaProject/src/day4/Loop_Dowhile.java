package day4;

public class Loop_Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while과 do while의 차이
		// while은 조건을 만족하지 않으면 한번도 실행안할 수 있다.
		// do while은 조건과 상관없이 무조건 한번 실행하고 그 후 조건 비교를 한다.
		int i = 1;
		while (i<5) {
			System.out.println("while 실행!");
			i++;
		}
		
		do { // do 문을 무조건 실행 한 후 while문 실행한다
			System.out.println("do~whlie 실행!");
		} while(i<5);
	}
	
	

}
