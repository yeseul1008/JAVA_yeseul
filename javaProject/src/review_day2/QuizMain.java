package review_day2;

import java.util.Scanner;

public class QuizMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 배열 회전 프로그램
//		사용자로부터 정수 배열(예: 5개)을 입력받고, 오른쪽으로 한 칸씩 회전시킨 결과를 출력하세요.
//		예: 1 2 3 4 5 → 5 1 2 3 4
		
		Scanner s = new Scanner(System.in);
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열에 들어갈 수를 입력하시오: ");
			arr[i] = s.nextInt();
		}
		System.out.print("회전 결과: ");
		System.out.print(arr[arr.length]);
		for(int i = 0; i<arr.length-4; i++) {
			System.out.print(arr[i]);
		}
		
//		2. 배열 두 개의 교집합 구하기
//		두 개의 정수 배열을 입력받아 교집합에 해당하는 숫자들을 출력하세요.
//		예: [1, 2, 3, 4], [3, 4, 5, 6] → 3, 4
//		* 교집합에 해당하는 숫자를 새로운 배열에 넣는게 아니라 그냥 출력
	}

}
