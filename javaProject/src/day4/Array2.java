package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. arr1안에 있는 값들의 평균 구하기
		int arr1[] = {1, 5, 4, 2, 10};
		double sum = 0;
		for(int i = 0; i<arr1.length; i++) {
			sum += arr1[i];
		}
		System.out.println("평균: " +sum/arr1.length);
	
		
		
		// 2. 사용자로부터 값을 5개 입력받아 순서대로 arr2에 넣기
		int arr2[] = new int[5];
		Scanner s = new Scanner(System.in);
		for(int j = 0; j < arr2.length; j++) {
			System.out.print((j+1)+"번째 숫자를 입력하시오: ");
			arr2[j] = s.nextInt();
		}
		System.out.println(Arrays.toString(arr2)); // 배열 출력
	}

}
