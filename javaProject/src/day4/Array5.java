package day4;

import java.util.Arrays;
import java.util.Random;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 6개의 공간의 배열을 만들어서 랜덤한 숫자 1~45사이의 값을 넣기
		// 중복이 발생하지않아야함
		int arr[] = new int[6];
		Random ran = new Random();
		for(int i = 0; i<arr.length; i++) {
			arr[i] = ran.nextInt(45)+1;		
			for(int a = 0; a<i; a++) { //i의 전까지 비교하기 위해 a<i
				if(arr[a]==arr[i]) {
				i--;	
				break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
