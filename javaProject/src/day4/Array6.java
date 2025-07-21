package day4;

import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. 배열에서 가장 큰 값, 가장 작은 값의 위치(index) 찾기
		// 가장 큰 값과 작은값 위치 바꾸기
		int arr[] = { 20, 5, 25, 10, 3 };
		int maxIndex = 0;
		int minIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
			if (arr[i] < arr[minIndex]) {
				minIndex = i;
		}
		}
		System.out.println("가장 큰 수 위치: "+ maxIndex);
		System.out.println("가장 큰 수 위치: "+ minIndex);

		
		int swap = arr[maxIndex];
		arr[maxIndex] = arr[minIndex];
		arr[minIndex] = swap;
		System.out.println(Arrays.toString(arr));
	}

}

