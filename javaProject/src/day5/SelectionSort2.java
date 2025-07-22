package day5;

import java.util.Arrays;

public class SelectionSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 앞에서 했던 선택정렬을 확장선있게 코드를 개선
		int arr[] = { 3, 4, 1, 5, 2 };
//                              length-1 -> 4번째가 결정되는 순간 자동으로 5번째도 결정되기 때문에 5번 다 반복할필요없음
		for (int a = 0; a < arr.length-1; a++) {
			int minIndex = a;
			for (int i = 1+a; i < arr.length; i++) {
				if (arr[minIndex] > arr[i]) {
					minIndex = i;
				}
			}
			int temp = arr[a];
			arr[a] = arr[minIndex];
			arr[minIndex] = temp;
			System.out.println(a+1+"회차 "+Arrays.toString(arr)); 
		}
		System.out.println("선택 정렬이 완료되었습니다.");
	}

}
