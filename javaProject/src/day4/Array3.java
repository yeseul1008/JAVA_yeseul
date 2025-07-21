package day4;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 5, 10, 25, 3 };
//		int[] arr_1 = { 1, 5, 10, 25, 3 };
		// 둘 다 가능

		// 1. arr 배열에서 가장 큰 값 찾기
//		int max = 0;
//	//  int max = arr[0]; 이렇게 하는게 더 효율적
//		for(int i = 0; i < arr.length; i++) {
//			if (max<arr[i]) {
//				max = arr[i];
//			}	
//		}
//		System.out.println(max);

		// 2. 배열에서 가장 큰 값의 위치(index) 찾기
		int maxIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
		}
		System.out.println("가장 큰 수 위치: "+ maxIndex);
		
	}

}
