package review_day2;

import java.util.Arrays;
import java.util.Random;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = ArrayFunc.randomArr(10, 1, 30);
		System.out.println(Arrays.toString(arr));
		// 오름차순 => Arrays.sort(arr);
		// 내림차순 => ArrayFunc.descSort(arr);
		ArrayFunc.descSort(arr);
		System.out.println(Arrays.toString(arr));

		//// 이차원배열
		// {1,2}
		// {3,4}
		// {5,6}
		// 3행 2열
		// new int[3][2]
		int arr2[][] = { 
				{ 10, 5 }, 
				{ 3, 7 }, 
				{ 2, 9 } };
		// arr2[0] => {10,5}
		// arr2[1] => {3,7}
		// arr2[2][1] => 9
		// arr2[1] = {30, 50}; 이렇게 바꾸기는 안됨
//		arr2[1][0] = 30;
//		arr2[1][1] = 50; //이렇게 하나씩 해야됨

//		int arr3[] = {100, 200};
//		
//		arr[1] = arr3; // 이것도 안됨

		// arr2의 모든 값의 합 구하기
		int sum = 0;
//		for (int i = 0; i < arr2.length; i++) {
//			for (int j = 0; j < arr2[i].length; j++) { // arr2[i].length = 2
//				sum += arr2[i][j];
//			}
//		}
//		System.out.println("arr2의 모든 값의 합: "+sum);
	
		for(int i = 0; i<arr2.length; i++) {
			sum += ArrayFunc.sum(arr2[i]);
		}
		
		// --------------
		// 4 * 5 배열에 랜덤한 숫자를 넣기
		// 랜덤 수의 범위는 10~50 사이
		int arr3[][] = new int[4][5];
		Random ran = new Random();
		for(int i = 0; i<arr3.length; i++) {
			for(int j = 0; j<arr3[i].length;j++) {
				arr3[i][j] = ran.nextInt(41)+10;
			}
		}
		System.out.println(Arrays.toString(arr3));
	}

}
