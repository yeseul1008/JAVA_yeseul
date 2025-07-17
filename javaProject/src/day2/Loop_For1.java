package day2;

public class Loop_For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문 (빠져나갈 구멍이 있어야 하기때문에 조건 필수)
		// 3가지 형태의 값 필요
//		for(int i =1; i < 10; i++ ) {
//		//  변수선언     조건     증감식(변수가 조건에 맞으면 실행시킨 후 증감식쪽으로 간다 다시 조건으로감)
//			System.out.println(i);
//		}
//		// 1 2 3 4 5 6 7 8 9
		
		// 10부터 역순으로 1까지 출력
		for(int a = 10; a >= 1; a--)
		{
			System.out.print(a + " ");
		}
	}

}
