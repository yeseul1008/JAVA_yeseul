package review_day2;

import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = ArrayFunc.randomArr(10, 1, 30);
		System.out.println(Arrays.toString(arr));
		
//		int oddnum = 0;
//		int evennum = 0;
//		for(int i = 0; i<arr.length;i++) {
//			if(arr[i]%2 == 0) {
//				evennum++;
//			}else if (arr[i]%2 == 1) {
//				oddnum++;
//			}
//		}
		
		int oddSize = ArrayFunc.arrLength(arr, "odd");
		int evenSize = ArrayFunc.arrLength(arr, "even");

		System.out.println("홀수 배열 길이: " + oddSize);
		System.out.println("짝수 배열 길이: " + evenSize);
		
		int oddArr[] = ArrayFunc.returnArr(arr, "odd", oddSize);
		// 홀수들만 담긴 배열을 리턴
		int oddArr2[] = ArrayFunc.returnArr(arr, "odd");
		// 홀수들만 담긴 배열을 리턴
		
	}

}
