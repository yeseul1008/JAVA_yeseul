package review_day2;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 8, 2, 6, 10, 4};
		
		// 내림차순 정렬
		ArrayFunc.minusArr(arr);
		Arrays.sort(arr);
		ArrayFunc.minusArr(arr);
		
		System.out.println(Arrays.toString(arr));
		
		int max = ArrayFunc.max(arr); // 배열내 가장 큰 값을 리턴
		System.out.println(max);
		// 클래스이름으로 접근가능하니까 static
		// 리턴값이 필요하니까 void가 아님. int같은 리턴값의 타입이 들어감
		
//		Arrays.sort(arr); // 정렬
//		System.out.println(Arrays.toString(arr));
//		
//		// 내림차순으로 바꾸기
//		int arr2[] = new int[arr.length];
//		for (int i = arr.length-1; i >=0; i--) {
//			arr2[arr.length-i] = arr[i];
//		}
//		System.out.println(Arrays.toString(arr2));
//	
//		for(int i = 0; i< arr.length; i++) {
//			arr[i] = -arr[i];
//		}
//		for(int i = 0; i< arr.length; i++) {
//			arr[i] = -arr[i];
//		}
//		System.out.println(Arrays.toString(arr));
	}

}
