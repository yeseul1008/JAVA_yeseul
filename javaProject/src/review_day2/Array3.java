package review_day2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자 5개를 입력받아 배열에 저장하고
		// 해당 배열의 평균을 구하세요.
//		Scanner s = new Scanner(System.in);
//		int arr[] = new int[5];
//		
//		for(int i = 0; i<arr.length; i++) {
//			System.out.print((i+1) + "번째 숫자 입력 :");
//			arr[i] = s.nextInt();
//		}
//		System.out.println("평균: "+ ArrayFunc.avg(arr));
//		
		// -----------------------------------
		// 5개의 공간을 가지는 배열에 랜덤한 수 1~10사이 값을 넣고
		// 해당 값들 중에서 가장 큰 값을 출력
		// 추가 1. 중복 없이 나오도록
		// 추가 2. 
		
		// 첫번째파라미터: 랜덤 숫자의 개수 
		// 두번째  "  : 랜덤한 숫자의 시작 점
		// 세번째  "  : 랜덤한 숫자의 끝
		// 결론 : 5개의 공간을 가지는 배열 생성 후
		//      20~100사이의 랜덤값을 넣고 해당 배열 리턴
//		Random ran = new Random();
//		int arr2[] = new int[5];
//
//		for (int i = 0; i < arr2.length; i++) {
//			arr2[i] = ran.nextInt(10) + 1;
//			for (int j = 0; j < i; j++) {
//				if (arr2[i] == arr2[j]) {
//					i--;
//				}
//			}
//
//		}
		
		int[] arr3 = ArrayFunc.randomArr(5, 20, 100);
		System.out.println(Arrays.toString(arr3));
		System.out.println("가장 큰 값 출력: " + ArrayFunc.max(arr3));
		
		
		// 크기가 10이고 랜덤한 숫자 50~200사이 값을 배열에 넣어서 출력
		int[] arr4 = ArrayFunc.randomArr(10, 50, 200);
		System.out.println(Arrays.toString(arr4));
	}

}
