package day5;

import java.util.Arrays;

public class Day4_Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,5,1,4,2};
		// 가장 작은 값의 위치찾기
		int index = 0;
		int min = arr[0];
		for (int i = 1; i<arr.length; i++) {
			if (min>arr[i]) {
				min = arr[i];
				index = i;
			}
		}
		int store = arr[0];
		arr[0] = arr[index];
		arr[index] = store;
		
		System.out.println("가장 작은 값: " + min);
		System.out.println("가장 작은 값의 인덱스: " + index);
		System.out.println(Arrays.toString(arr));
	}

}
