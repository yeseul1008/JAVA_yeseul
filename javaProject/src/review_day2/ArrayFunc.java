package review_day2;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Random;

public class ArrayFunc {

	// 배열의 모든값을 음수로 만드는 메소드
	// parameter1: 정수형 배열
	public static void minusArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -arr[i];
		}
	}

	// 배열에서 가장 큰 값을 찾아서 리턴하는 메소드
	// parameter1: 정수형 배열
	public static int max(int[] arr) {
		int maxValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}

		return maxValue;

	}
	
	// 배열의 모든값의 합을 구해서 리턴하는 메소드
	// parameter1: 정수형 배열
	public static int sum(int[] arr) {
		int s = 0;
		for (int i = 0; i < arr.length; i++) {
			s += arr[i];
		}
		return s;
	}
	
	// 배열에서 특정 인덱스의 값을 리턴하는 메소드
	// parameter1: 정수형 배열
	// parameter2: 정수 (배열의 인덱스)
	public static int indexValue(int[] arr, int a) {
		return arr[a];
	}
	//배열의 평균값을 리턴하는 메소드
	// parameter1: 정수형 배열
	public static double avg(int[] arr) {
		double avgavg = (double) sum(arr) / arr.length;
		return avgavg;
	}
	// 배열에서 특정 값(parameter2)이 있는지 없는지 판별하는 메소드
	// parameter1: 정수형 배열
	// parameter2: 정수(찾고자 하는 값)
	// return true or false (bool)
	public static boolean searchValue(int[] arr, int a) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				return true;
			}
		}
		return false; // 다른 구문이면 리턴 여러개 가능
	}
	
	// 배열에 랜덤한 값을 넣어서 만든 후 리턴해주는 메소드
	// parameter1: 배열의 사이즈
	// parameter2: 랜덤숫자의 시작 숫자
	// parameter3: 랜덤숫자의 끝점
	// return: 랜덤숫자가 담긴 배열
	public static int[] randomArr(int a, int b, int c) {
		Random ran = new Random();
		int arr2[] = new int[a];

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = ran.nextInt(b, c + 1); // (c-b+1)+b
			for (int j = 0; j < i; j++) {
				if (arr2[i] == arr2[j]) {
					i--;
				}
			}

		}
		return arr2;
	}

	// 배열에서 홀수(odd), 짝수(even) 개수 리턴해주는 메소드
	// parameter1: 정수형 배열
	// parameter2: 홀수, 짝수 구분 문자열(odd or even)
	// ** kind에 odd, even 외에 값에 대한 예외처리 필요
	public static int arrLength(int[] arr, String numtype) {
		int size = 0;
		int num = numtype.equals("even") ? 0 : 1; // 물음표 앞이 참이면 0, 거짓이면 1

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == num) {
				size++;
			}
		}
		return size;

	}
	// 배열에서 홀수(odd), 짝수(even)를 따로 분류해서 배열로 만든 후 리턴
	// parameter1: 정수형 배열
	// parameter2: 홀수, 짝수 구분 문자열(odd or even)
	// parameter3: 정수 => 홀수 혹은 짝수 배열의 개수	
	// ** kind에 odd, even 외에 값에 대한 예외처리 필요 **
	public static int[] returnArr(int[] arr, String kind, int size) {
		int newArr[] = new int[size];
		int num = kind.equals("even") ? 0 : 1;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == num) {
				newArr[index++] = arr[i];
			}
		}
		
		return newArr;
	}
	// 배열에서 홀수(odd), 짝수(even)를 따로 분류해서 배열로 만든 후 리턴
	// parameter1: 정수형 배열
	// parameter3: 정수 => 홀수 혹은 짝수 배열의 개수	
	// ** kind에 odd, even 외에 값에 대한 예외처리 필요 **
	public static int[] returnArr(int[] arr, String kind) {
//		int newArr[] = new int[arrLength(arr, kind)];
//		int num = kind.equals("even") ? 0 : 1;
//		int index = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 == num) {
//				newArr[index++] = arr[i];
//			}
//		}
		
		return returnArr(arr, kind, arrLength(arr, kind));	// 사이즈만 추가해서 위에서 만든 매개변수3개짜리 메소드를 호출함
	}
	// 내림차순 정렬
	//1. 모든 수에 -를 붙인다.
	//2. 오름차순 정렬을한다.
	//3. 다시 모든 수에 -를 붙인다.
	public static void descSort(int[] arr) {
		minusArr(arr);
		Arrays.sort(arr);
		minusArr(arr);

	}
}
