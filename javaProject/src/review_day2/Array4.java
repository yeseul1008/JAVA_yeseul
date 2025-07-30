package review_day2;

import java.util.Arrays;
import java.util.Random;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 공간 10개, 숫자 범위 1~30

		int arr[] = ArrayFunc.randomArr(10, 1, 30);
		System.out.println(Arrays.toString(arr));
		
		// 홀수배열 {1,9,25,19}
		// 짝수배열 {20,22,10,24,2,12}
		// 홀 짝 구분해서 각각 다른 배열에 저장 oddArr, evenArr
		int oddnum = 0;
		int evennum = 0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]%2 == 0) {
				evennum++;
			}else if (arr[i]%2 == 1) {
				oddnum++;
			}
		}
		int[] oddArr = new int[oddnum];
		int[] evenArr = new int[evennum];
		
		int a = 0;
		int b = 0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]%2 == 0) {
				evenArr[a] = arr[i]; // evenArr[a++] 이렇게 해도됨
				a++;
			}else {
				oddArr[b] = arr[i];
				b++;
			}
		}
		
		System.out.println("홀수배열: "+Arrays.toString(oddArr));
		System.out.println("짝수배열: "+Arrays.toString(evenArr));
	}

}
