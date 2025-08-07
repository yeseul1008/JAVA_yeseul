package quizEx;

import java.util.Arrays;
import java.util.Random;

public class ArrayManager {


//		5. ArrayManager 클래스를 작성하시오.
//		 조건 1. int형 배열을 매개변수(인자)로 받아서 두번째로 큰 숫자를 리턴해주는 함수를 작성하시오.
//		 조건 2. 함수 호출 시 랜덤한 5개의 숫자 int형 배열에 담고 해당 배열을 리턴해주는 함수를 작성하시오.
//		        단, 랜덤한 숫자는 홀수이면서 1~30사이의 값이어야 함.
//		 조건 3. 모든 메소드는 ststic으로 선언할 것.
//		 조건 4. 외부함수 사용에 대한 제약 없음.
	
	public static int twoReturn(int[] arr) {
		
		Arrays.sort(arr);
		int twoMax = arr[arr.length-2];
		return twoMax;
	}
	
	public static int[] returnArr() {
		Random ran = new Random();
		int arr[] = new int[5];
		for (int i = 0; i<arr.length; i++) {
			int num = ran.nextInt(30)+1;
			if (num % 2 == 1) {
				arr[i] = num;
			}else {
				i--;
			}
		}
		return arr;
	}

}
