package day4;

import java.util.Arrays;

public class Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 배열에 있는 수를 모두 절대값(음수->양수 로 바꾸시오)
		int arr[] = {3, 5, -15, 10, -8};
		for(int i = 0; i<arr.length; i++) {
			
			//1.
//			arr[i] = arr[i] >= 0 ? arr[i] : -arr[i];
			//2.
//			if(arr[i]<0) {
//				arr[i] = -arr[i];
//			}
			//3.
			arr[i] = Math.abs(arr[i]); //하나씩 절대값으로 바꿈
			
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
