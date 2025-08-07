package exam0807;

import java.util.Arrays;
import java.util.Random;

public class ArrayManager {
//	 조건 1. int형 배열을 매개변수(인자)로 받아서 배열내에서 가장 큰 수와 가장 작은 수의 차이를 리턴하는 메소드를 작성하시오.
//	 조건 2. 함수 호출 시 랜덤한 5개의 숫자를 int형 배열에 담고 해당 배열을 리턴해주는 함수를 작성하시오.
//	        단, 랜덤한 숫자는 -15~15 범위의 값이어야 함.
//	 조건 3. 모든 메소드는 ststic으로 선언할 것.
//	 조건 4. 외부함수 사용에 대한 제약 없음.
	
	public static int returnManMin(int arr[]) {
		Arrays.sort(arr);  
		int Max = arr[arr.length-1];
		int Min = arr[0];
		return (Max - Min);
	}
	public static int[] returnArr() {
		Random ran = new Random();
		int arr[] = new int[5];
		for (int i = 0; i<arr.length; i++) {
			int num = ran.nextInt(-15,16);
			arr[i] = num;
		}
		return arr;
	}

	

}
