package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자로부터 배열의 크기를 입력받아서 해당 크기의 배열 생성
		//배열 내의 값은 1부터 배열 크기까지 순차적으로 넣기
		// 사이즈가 0이하 숫자가 들어오면 다시 입력하도록
		Scanner s = new Scanner(System.in);
		
		// 방법1
//		System.out.print("숫자를 입력하시오: ");
//		int num = 0;
//		while(true) {
//			num = s.nextInt(); //구문 안에서 선언한 변수는 그 구문이 사라지면 아예사라짐. 그러므로 밖에서 선언하고 구문 안에서는 int같은 타입 없이 변수를 사용해야함
//			if(num<=0) {
//				System.out.print("0 이상으로 다시 입력하세요: ");
//			}
//			else {
//				break;
//			}
//		}
		
		
		// 방법2
		int num = 0;
		do {
			System.out.println("배열 크기 입력(1이상): ");
			num = s.nextInt();
		}
		while(num<=0); //입력값이 0보다 작으면 다시 do 실행
		
		// 먼저 do 실행하고 while()안 조건에 만족하면 계속해서 반복실행
		
		
		
		int arr[] = new int[num];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (i+1);
		}
		System.out.println(Arrays.toString(arr));
	}

}
